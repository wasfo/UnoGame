package org.example.Game;

import org.example.Cards.ActionCards.ActionCard;
import org.example.Cards.CardBehavior.CardBehavior;
import org.example.Cards.CardBehavior.SkipCardBehavior;

public class GameManager {

    private Game game;
    public void progress(){
        CardBehavior cardBehavior = new SkipCardBehavior();


        if(game.rule.isValidPlay()){

        }

    }

}
