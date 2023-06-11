package org.example.GameComponents;
import org.example.Cards.Card;
import java.util.Stack;

/**
 * the play area for players where they will be playing their cards
 */

public class PlayArea {
    private Stack<Card> playStack;

    public PlayArea() {
        playStack = new Stack<>();
    }

    public void addCard(Card card) {
        playStack.add(card);
    }
    public Card getCurrentCard(){
        if(playStack.isEmpty())
            return null;
        return playStack.pop();
    }

    public Stack<Card> getPlayStack() {
        return playStack;
    }

    public void setPlayStack(Stack<Card> playStack) {
        this.playStack = playStack;
    }
}
