package org.example.Cards.NumberedCards;

import org.example.Cards.Card;
import org.example.Cards.Color;
import org.example.Game.Game;

public class NumberedCard extends Card {

    private final int number;
    private Color color;

    public NumberedCard(int number, Color color) {
        super(color);
        this.number = number;
    }


}
