package org.example.GameComponents;

import org.example.Cards.Card;

import java.util.List;


public class Player {
    private String name;
    private List<Card> playerCards;

    public Player(String name, List<Card> playerCards) {
        this.name = name;
        this.playerCards = playerCards;
    }

    public Card playedCard(Card card) {
        return card;
    }
    public void playCard(Card card, PlayArea playArea) {
        if (card != null) {
            playArea.addCard(card);
        }
    }
    public void drawCards(int num, CardDeck cards) {
        for (int i = 0; i < num; i++) {
            Card card = cards.drawTopCard();
            playerCards.add(card);
        }
    }
    public boolean hasLegalCardToPlay(PlayArea playArea) {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(List<Card> playerCards) {
        this.playerCards = playerCards;
    }
}
