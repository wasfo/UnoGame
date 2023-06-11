package org.example.Cards;
import org.example.Cards.ActionCards.ActionType;
import org.example.Cards.ActionCards.DrawTwoCard;
import org.example.Cards.ActionCards.ReverseCard;
import org.example.Cards.ActionCards.SkipCard;
import org.example.Cards.NumberedCards.NumberedCard;
import org.example.Cards.WildCards.Wild;
import org.example.Cards.WildCards.WildFourCard;
import org.example.Cards.WildCards.WildType;

public class CardFactory {

    private CardFactory() {
    }

    public static Card createActionCard(ActionType actionType, Color color) {
        if (actionType == null)
            throw new IllegalArgumentException("null action type ");
        if (actionType == ActionType.Reverse)
            return new ReverseCard(color);
        if (actionType == ActionType.DrawTwo)
            return new DrawTwoCard(color);
        if (actionType == ActionType.Skip)
            return new SkipCard(color);

        throw new IllegalArgumentException("Incorrect argument");
    }

    public static Card createNumberedCard(int number, Color color) {
        return new NumberedCard(number, color);
    }

    public static Card createWildCard(WildType type) {
        if (type == WildType.Wild)
            return new Wild();
        if (type == WildType.WildFour)
            return new WildFourCard();
        throw new IllegalArgumentException("Incorrect argument");
    }
}

