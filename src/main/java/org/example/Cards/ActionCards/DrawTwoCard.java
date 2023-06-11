package org.example.Cards.ActionCards;

import org.example.Cards.Color;
import org.example.Game.Game;

public class DrawTwoCard extends ActionCard {


    public DrawTwoCard(Color color) {
        super(color);
    }

    @Override
    public void activate(Game game) {
        game.getNextPlayer().drawCards(2, game.getCardDeck());
    }

}
