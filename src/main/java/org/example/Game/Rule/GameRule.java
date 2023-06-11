package org.example.Game.Rule;
import org.example.Cards.Card;
import org.example.Game.Game;


public interface GameRule {
    public boolean isValidPlay(Card playCard, Card topCard);
    public void setSevenCardsForEach(Game game);
}
