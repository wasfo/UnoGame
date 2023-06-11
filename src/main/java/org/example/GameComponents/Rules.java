package org.example.GameComponents;


import org.example.Cards.Card;

public interface Rules {

    default public boolean cardsColorMatches(Card card, PlayArea playArea){

        playArea.getCurrentCard();

        return false;
    }

}
