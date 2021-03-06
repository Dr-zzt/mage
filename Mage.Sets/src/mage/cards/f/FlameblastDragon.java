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
package mage.cards.f;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.costs.mana.ManaCosts;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.common.TargetAnyTarget;

/**
 * @author Loki
 */
public class FlameblastDragon extends CardImpl {

    public FlameblastDragon(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{4}{R}{R}");
        this.subtype.add(SubType.DRAGON);

        this.power = new MageInt(5);
        this.toughness = new MageInt(5);

        // Flying
        this.addAbility(FlyingAbility.getInstance());
        // Whenever Flameblast Dragon attacks, you may pay {X}{R}. If you do, Flameblast Dragon deals X damage to any target.
        Ability ability = new AttacksTriggeredAbility(new FlameblastDragonEffect(), false);
        ability.addTarget(new TargetAnyTarget());
        this.addAbility(ability);
    }

    public FlameblastDragon(final FlameblastDragon card) {
        super(card);
    }

    @Override
    public FlameblastDragon copy() {
        return new FlameblastDragon(this);
    }
}

class FlameblastDragonEffect extends OneShotEffect {

    FlameblastDragonEffect() {
        super(Outcome.Benefit);
        staticText = "you may pay {X}{R}. If you do, {this} deals X damage to any target";
    }

    FlameblastDragonEffect(final FlameblastDragonEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        ManaCosts cost = new ManaCostsImpl("{X}{R}");
        if (player != null) {
            if (player.chooseUse(Outcome.Damage, "Pay " + cost.getText() + "? If you do, Flameblast Dragon deals X damage to any target", source, game)) {
                int costX = player.announceXMana(0, Integer.MAX_VALUE, "Announce the value for {X}", game, source);
                cost.add(new GenericManaCost(costX));
                if (cost.pay(source, game, source.getSourceId(), source.getControllerId(), false, null)) {
                    Permanent permanent = game.getPermanent(source.getFirstTarget());
                    if (permanent != null) {
                        permanent.damage(costX, source.getSourceId(), game, false, true);
                        return true;
                    }
                    Player targetPlayer = game.getPlayer(source.getFirstTarget());
                    if (targetPlayer != null) {
                        targetPlayer.damage(costX, source.getSourceId(), game, false, true);
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public FlameblastDragonEffect copy() {
        return new FlameblastDragonEffect(this);
    }

}
