package org.example.Game;

import org.example.Cards.ActionCards.ActionType;
import org.example.Cards.CardFactory;
import org.example.Cards.Color;
import org.example.Cards.WildCards.WildType;
import org.example.Game.PenaltyRule.SayUnoPenalty;
import org.example.Game.Rule.StandardRule;

import java.util.ArrayList;
import java.util.List;

public class ClassicUno extends Game {


    public ClassicUno(int numberOfPlayers) {
        super(numberOfPlayers);

    }

    @Override
    public void play() {
        this.setRule(new StandardRule());
        this.setPenaltyRule(new SayUnoPenalty());
    }

    public void setupCards() {
        setupActionCards();
        setupNumberedCards();
        setupWildCards();
    }

    public void setupNumberedCards() {
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
        for (int i = 1; i < 4; i++) {
            Color color = colors[i];
            for (int j = 0; j < 10; i++) {
                cardDeck.addCard(CardFactory.createNumberedCard(j, color));
                cardDeck.addCard(CardFactory.createNumberedCard(j, color));
            }
        }
        for (int i = 0; i < 4; i++) {
            cardDeck.addCard(CardFactory.createNumberedCard(0, colors[i]));
        }
    }

    public void setupActionCards() {
        List<Color> colorList = new ArrayList<>();
        colorList.add(Color.RED);
        colorList.add(Color.BLUE);
        colorList.add(Color.YELLOW);
        colorList.add(Color.GREEN);
        for (int i = 0; i < 2; i++) {
            for (Color color : colorList) {
                cardDeck.addCard(CardFactory.createActionCard(ActionType.DrawTwo, color));
                cardDeck.addCard(CardFactory.createActionCard(ActionType.Skip, color));
                cardDeck.addCard(CardFactory.createActionCard(ActionType.Reverse, color));
            }
        }
    }

    public void setupWildCards() {
        for (int i = 0; i < 4; i++) {
            cardDeck.addCard(CardFactory.createWildCard(WildType.Wild));
        }
        for (int i = 0; i < 4; i++) {
            cardDeck.addCard(CardFactory.createWildCard(WildType.WildFour));
        }
    }

}
