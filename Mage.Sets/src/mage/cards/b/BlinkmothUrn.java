/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mage.cards.b;

import java.util.UUID;
import mage.Mana;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfPreCombatMainTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.TargetController;
import mage.filter.common.FilterArtifactPermanent;
import mage.filter.predicate.permanent.ControllerIdPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;

/**
 *
 * @author nickmyers
 */
public class BlinkmothUrn extends CardImpl {

    public BlinkmothUrn(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ARTIFACT},"{5}");

        // At the beginning of each player's precombat main phase, if
        // Blinkmoth Urn is untapped, that player adds {1} to their
        // mana pool for each artifact he or she controls.
        this.addAbility(new BeginningOfPreCombatMainTriggeredAbility(new BlinkmothUrnEffect(), TargetController.ANY, false));
    }

    public BlinkmothUrn(final BlinkmothUrn card) {
        super(card);
    }

    @Override
    public BlinkmothUrn copy() {
        return new BlinkmothUrn(this);
    }

}

class BlinkmothUrnEffect extends OneShotEffect {

    public BlinkmothUrnEffect() {
        super(Outcome.PutManaInPool);
        this.staticText = "if Blinkmoth Urn is untapped, that player adds {1} for each artifact he or she controls";
    }

    public BlinkmothUrnEffect(final BlinkmothUrnEffect effect) {
        super(effect);
    }

    @Override
    public BlinkmothUrnEffect copy() {
        return new BlinkmothUrnEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(game.getActivePlayerId());
        FilterArtifactPermanent filter = new FilterArtifactPermanent("artifacts you control");
        filter.add(new ControllerIdPredicate(game.getActivePlayerId()));
        Permanent sourcePermanent = game.getPermanent(source.getSourceId());
        if (player != null && sourcePermanent != null && !sourcePermanent.isTapped()) {
            player.getManaPool().addMana(Mana.ColorlessMana(
                    game.getState().getBattlefield().getActivePermanents(filter, source.getControllerId(), source.getSourceId(), game).
                    size()), game, source, false);
            return true;
        }
        return false;
    }
}
