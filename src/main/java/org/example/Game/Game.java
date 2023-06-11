package org.example.Game;
import org.example.Game.PenaltyRule.PenaltyRule;
import org.example.Game.Rule.GameRule;
import org.example.GameComponents.CardDeck;
import org.example.GameComponents.Player;
import java.util.ArrayList;
import java.util.List;

public abstract class Game {
    protected int numberOfPlayers;
    protected List<Player> players;
    protected GameRule rule;
    protected PenaltyRule penaltyRule;
    protected CardDeck cardDeck;
    protected Player currentPlayer;
    protected Player nextPlayer;

    public Game (int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
        players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            /// TODO: 6/11/2023  must initialize players and add them to the list
        }
    }

    public abstract void play();

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    protected GameRule getRule() {
        return rule;
    }

    protected void setRule(GameRule rule) {
        this.rule = rule;
    }

    protected PenaltyRule getPenaltyRule() {
        return penaltyRule;
    }

    protected void setPenaltyRule(PenaltyRule penaltyRule) {
        this.penaltyRule = penaltyRule;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public CardDeck getCardDeck() {
        return cardDeck;
    }

    public void setCardDeck(CardDeck cardDeck) {
        this.cardDeck = cardDeck;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(Player nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
}
