package org.example.Game.Rule;
import org.example.Cards.Card;
import org.example.Cards.WildCards.WildCard;
import org.example.Game.Game;
import org.example.GameComponents.Player;


public class StandardRule implements GameRule {

    @Override
    public boolean isValidPlay(Card playCard, Card topCard) {
        if (playCard instanceof WildCard)
            return true;
        return playCard.getColor() == topCard.getColor();
    }

    @Override
    public void setSevenCardsForEach(Game game) {
        for(Player player : game.getPlayers()){
            player.setPlayerCards();
        }
    }


}
