package org.example.Game.Rule;
import org.example.Cards.Card;







public class StandardRule implements GameRule{

    @Override
    public boolean isValidPlay(Card playCard, Card topCard) {
        return false;
    }
}
