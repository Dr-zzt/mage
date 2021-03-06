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
package mage.cards.p;

import java.util.LinkedHashSet;
import java.util.UUID;
import mage.MageInt;
import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.DelayedTriggeredAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.BecomesMonarchSourceEffect;
import mage.abilities.effects.common.CreateDelayedTriggeredAbilityEffect;
import mage.abilities.effects.common.ExileTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.TargetController;
import mage.constants.Zone;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.game.ExileZone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.players.Player;
import mage.target.common.TargetCreaturePermanent;
import mage.util.CardUtil;

/**
 *
 * @author LevelX2
 */
public class PalaceJailer extends CardImpl {

    private final static FilterCreaturePermanent filter = new FilterCreaturePermanent("creature an opponent controls");

    static {
        filter.add(new ControllerPredicate(TargetController.OPPONENT));
    }

    public PalaceJailer(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{W}{W}");

        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SOLDIER);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // When Palace Jailer enters the battlefield, you become the monarch.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new BecomesMonarchSourceEffect(), false));

        // When Palace Jailer enters the battlefield, exile target creature an opponent controls until an opponent becomes the monarch. (That creature returns under its owner's control.)
        Ability ability = new EntersBattlefieldTriggeredAbility(new PalaceJailerExileEffect());
        ability.addTarget(new TargetCreaturePermanent(filter));
        ability.addEffect(new CreateDelayedTriggeredAbilityEffect(new OnOpponentBecomesMonarchReturnExiledToBattlefieldAbility()));
        this.addAbility(ability);
    }

    public PalaceJailer(final PalaceJailer card) {
        super(card);
    }

    @Override
    public PalaceJailer copy() {
        return new PalaceJailer(this);
    }
}

class PalaceJailerExileEffect extends OneShotEffect {

    public PalaceJailerExileEffect() {
        super(Outcome.Benefit);
        this.staticText = "exile target creature an opponent controls until an opponent becomes the monarch. <i>(That creature returns under its owner's control.)</i>";
    }

    public PalaceJailerExileEffect(final PalaceJailerExileEffect effect) {
        super(effect);
    }

    @Override
    public PalaceJailerExileEffect copy() {
        return new PalaceJailerExileEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        MageObject sourceObject = source.getSourceObject(game);
        if (sourceObject != null) {
            return new ExileTargetEffect(CardUtil.getExileZoneId(game, source.getSourceId(), source.getSourceObjectZoneChangeCounter()), sourceObject.getIdName()).apply(game, source);
        }
        return false;
    }
}

class OnOpponentBecomesMonarchReturnExiledToBattlefieldAbility extends DelayedTriggeredAbility {

    public OnOpponentBecomesMonarchReturnExiledToBattlefieldAbility() {
        super(new PalaceJailerReturnExiledPermanentsEffect(), Duration.OneUse);
        this.usesStack = false;
        this.setRuleVisible(false);
    }

    public OnOpponentBecomesMonarchReturnExiledToBattlefieldAbility(final OnOpponentBecomesMonarchReturnExiledToBattlefieldAbility ability) {
        super(ability);
    }

    @Override
    public OnOpponentBecomesMonarchReturnExiledToBattlefieldAbility copy() {
        return new OnOpponentBecomesMonarchReturnExiledToBattlefieldAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.BECOMES_MONARCH;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        return game.getOpponents(getControllerId()).contains(event.getPlayerId());
    }
}

class PalaceJailerReturnExiledPermanentsEffect extends OneShotEffect {

    public PalaceJailerReturnExiledPermanentsEffect() {
        super(Outcome.Benefit);
        this.staticText = "Return exiled creature";
    }

    public PalaceJailerReturnExiledPermanentsEffect(final PalaceJailerReturnExiledPermanentsEffect effect) {
        super(effect);
    }

    @Override
    public PalaceJailerReturnExiledPermanentsEffect copy() {
        return new PalaceJailerReturnExiledPermanentsEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        MageObject sourceObject = source.getSourceObject(game);
        if (sourceObject != null && controller != null) {
            UUID exileZone = CardUtil.getExileZoneId(game, source.getSourceId(), source.getSourceObjectZoneChangeCounter());
            if (exileZone != null) {
                ExileZone exile = game.getExile().getExileZone(exileZone);
                if (exile != null) {
                    controller.moveCards(new LinkedHashSet<>(exile.getCards(game)), Zone.BATTLEFIELD, source, game, false, false, true, null);
                }
                return true;
            }
        }
        return false;
    }
}
