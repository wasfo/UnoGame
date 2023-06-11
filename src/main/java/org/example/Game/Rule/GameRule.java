package org.example.Game.Rule;
import org.example.Cards.Card;



public interface GameRule {
    public boolean isValidPlay(Card playCard, Card topCard);
}
