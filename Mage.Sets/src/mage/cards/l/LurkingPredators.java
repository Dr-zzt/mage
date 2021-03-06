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
package mage.cards.l;

import java.util.UUID;
import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.common.SpellCastOpponentTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.Cards;
import mage.cards.CardsImpl;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.players.Player;

/**
 *
 * @author North
 */
public class LurkingPredators extends CardImpl {

    public LurkingPredators(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ENCHANTMENT},"{4}{G}{G}");

        // Whenever an opponent casts a spell, reveal the top card of your library. If it's a creature card, put it onto the battlefield. Otherwise, you may put that card on the bottom of your library.
        this.addAbility(new SpellCastOpponentTriggeredAbility(new LurkingPredatorsEffect(), false));
    }

    public LurkingPredators(final LurkingPredators card) {
        super(card);
    }

    @Override
    public LurkingPredators copy() {
        return new LurkingPredators(this);
    }
}

class LurkingPredatorsEffect extends OneShotEffect {

    public LurkingPredatorsEffect() {
        super(Outcome.PutCreatureInPlay);
        this.staticText = "reveal the top card of your library. If it's a creature card, put it onto the battlefield. Otherwise, you may put that card on the bottom of your library";
    }

    public LurkingPredatorsEffect(final LurkingPredatorsEffect effect) {
        super(effect);
    }

    @Override
    public LurkingPredatorsEffect copy() {
        return new LurkingPredatorsEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        MageObject sourceObject = game.getObject(source.getSourceId());
        if (controller == null || sourceObject == null) {
            return false;
        }

        if (controller.getLibrary().hasCards()) {
            Card card = controller.getLibrary().getFromTop(game);
            Cards cards = new CardsImpl(card);
            controller.revealCards(sourceObject.getIdName(), cards, game);

            if (card != null) {
                if (card.isCreature()) {
                    controller.moveCards(card, Zone.BATTLEFIELD, source, game);
                } else if (controller.chooseUse(Outcome.Neutral, "Put " + card.getIdName() + " on the bottom of your library?", source, game)) {
                    controller.putCardsOnBottomOfLibrary(cards, game, source, false);
                }
            }
        }
        return true;
    }
}
