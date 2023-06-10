package org.example.cards;

import org.example.cards.SpecialCards.SpecialCard;

public class CardFactory {

    static public Card getSpecialCard(String cardType) {
        if (cardType == null)
            return null;
        return new SpecialCard();
    }

    static public Card getNumberedCard(int number, Color color) {
        if (number < 0 || color == null)
            return null;
        return new NumberedCard(number, color);
    }

    public static void main(String[] args) {
        Card card = CardFactory.getNumberedCard(1, Color.BLUE);
    }
}
