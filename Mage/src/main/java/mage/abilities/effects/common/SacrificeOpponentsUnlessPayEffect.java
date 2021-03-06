/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */

package mage.abilities.effects.common;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.costs.Cost;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.costs.mana.ManaCost;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.StaticValue;
import mage.abilities.effects.OneShotEffect;
import mage.constants.Outcome;
import mage.constants.TargetController;
import mage.filter.FilterPermanent;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.TargetPermanent;
import mage.util.CardUtil;

/**
 *
 * @author Eirkei
 */
public class SacrificeOpponentsUnlessPayEffect extends OneShotEffect{
    
    protected Cost cost;
    protected DynamicValue dynamicGenericMana;
    protected DynamicValue amount;
    protected FilterPermanent filter;
    
    public SacrificeOpponentsUnlessPayEffect(Cost cost) {
        this(cost, new FilterPermanent(), 1);
    }
    
    public SacrificeOpponentsUnlessPayEffect(int genericManaCost) {
        this(genericManaCost, new FilterPermanent(), 1);
    }
    
    public SacrificeOpponentsUnlessPayEffect(Cost cost, FilterPermanent filter) {
        this(cost, filter, 1);
    }
    
    public SacrificeOpponentsUnlessPayEffect(int genericManaCost, FilterPermanent filter) {
        this(genericManaCost, filter, 1);
    }
    
    public SacrificeOpponentsUnlessPayEffect(Cost cost, FilterPermanent filter, int amount) {
        this(cost, filter, new StaticValue(amount));
    }
    
    public SacrificeOpponentsUnlessPayEffect(int genericManaCost, FilterPermanent filter, int amount) {
        this(new GenericManaCost(genericManaCost), filter, new StaticValue(amount));
    }
    
    public SacrificeOpponentsUnlessPayEffect(Cost cost, FilterPermanent filter, DynamicValue amount) {
        super(Outcome.Sacrifice);
        this.cost = cost;
        this.amount = amount;
        this.filter = filter;
        setText();
    }
    
    public SacrificeOpponentsUnlessPayEffect(DynamicValue dynamicGenericMana, FilterPermanent filter, DynamicValue amount) {
        super(Outcome.Sacrifice);
        this.dynamicGenericMana = dynamicGenericMana;
        this.amount = amount;
        this.filter = filter;
        setText();
    }
    
    public SacrificeOpponentsUnlessPayEffect(final SacrificeOpponentsUnlessPayEffect effect) {
        super(effect);
        if (effect.cost != null) {
            this.cost = effect.cost.copy();
        }
        
        if (effect.dynamicGenericMana != null){
            this.dynamicGenericMana = effect.dynamicGenericMana.copy();
        }
        
        if (effect.amount != null){
            this.amount = effect.amount.copy();
        }
        
        if (effect.filter != null){
            this.filter = effect.filter.copy();
        }
    }
    
    @Override
    public SacrificeOpponentsUnlessPayEffect copy() {
        return new SacrificeOpponentsUnlessPayEffect(this);
    }
    
    @Override
    public boolean apply(Game game, Ability source) {
        List<UUID> permsToSacrifice = new ArrayList<>();
        filter.add(new ControllerPredicate(TargetController.YOU));
        
        for (UUID playerId : game.getOpponents(source.getControllerId())) {
            Player player = game.getPlayer(playerId);
            
            if (player != null) {
                Cost costToPay;

                if (cost != null) {
                    costToPay = cost.copy();
                } else {
                    costToPay = new GenericManaCost(dynamicGenericMana.calculate(game, source, this));
                }

                String message;

                if (costToPay instanceof ManaCost) {
                    message = "Would you like to pay " + costToPay.getText() + " to prevent sacrifice effect?";
                } else {
                    message = costToPay.getText() + " to prevent sacrifice effect?";
                }

                costToPay.clearPaid();

                if (!(player.chooseUse(Outcome.Benefit, message, source, game) && costToPay.pay(source, game, source.getSourceId(), player.getId(), false, null))) {
                    game.informPlayers(player.getLogName() + " chooses not to pay " + costToPay.getText() + " to prevent the sacrifice effect");

                    int numTargets = Math.min(amount.calculate(game, source, this), game.getBattlefield().countAll(filter, player.getId(), game));

                    if (numTargets > 0) {
                        TargetPermanent target = new TargetPermanent(numTargets, numTargets, filter, true);

                        if (target.canChoose(player.getId(), game)) {
                            player.chooseTarget(Outcome.Sacrifice, target, source, game);
                            permsToSacrifice.addAll(target.getTargets());
                        }
                    }
                } else {
                    game.informPlayers(player.getLogName() + " chooses to pay " + costToPay.getText() + " to prevent the sacrifice effect");
                }
            }
        }
        
        for (UUID permID : permsToSacrifice) {
            Permanent permanent = game.getPermanent(permID);
            
            if (permanent != null) {
                permanent.sacrifice(source.getSourceId(), game);
            }
        }
        
        return true;
    }
    
    private void setText() {
        StringBuilder sb = new StringBuilder();
        sb.append("each opponent sacrifices ");
        
        if (amount.toString().equals("X")) {
            sb.append(amount.toString());
        } else {
            if (amount.toString().equals("1")) {
                if (!filter.getMessage().startsWith("a ") && !filter.getMessage().startsWith("an ")) {
                    sb.append('a');
                }
            } else {
                sb.append(CardUtil.numberToText(amount.toString()));
            }
        }
        
        sb.append(' ');
        sb.append(filter.getMessage());
        
        sb.append(" unless he or she pays ");
        
        if (cost != null) {
            sb.append(cost.getText());
        } else {
            sb.append("{X}");
        }
        
        if (dynamicGenericMana != null && !dynamicGenericMana.getMessage().isEmpty()) {
            sb.append(", where X is ");
            sb.append(dynamicGenericMana.getMessage());
        }
        
        staticText = sb.toString();
    }
}
