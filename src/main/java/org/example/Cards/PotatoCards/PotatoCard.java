package org.example.Cards.PotatoCards;

import org.example.Cards.Card;
import org.example.Cards.CardBehavior.CardBehavior;
import org.example.Cards.Color;

import java.util.List;

public class PotatoCard extends Card {
   private CardBehavior behavior;

    private List<CardBehavior> behaviors;

    public void addBehavior(CardBehavior behavior) {
        this.behavior = behavior;
    }

    public PotatoCard(Color color) {
        super(color);
    }

}
