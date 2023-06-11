package org.example.Cards.CardBehavior;

import org.example.Game.Game;

public class DrawTwoCardBehavior implements CardBehavior {

    @Override
    public void performAction(Game game) {

        game.nextTurn();
        game.getNextPlayer().drawCards(2, game.getCardDeck());
    }
}
