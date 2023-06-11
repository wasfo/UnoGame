package org.example.GameComponents;
import org.example.Cards.Card;
import java.util.Collections;
import java.util.Stack;

public class CardDeck {

    private final Stack<Card> cardsDeck = new Stack<>();

    public void shuffleDeck() {
        Collections.shuffle(cardsDeck);
    }

    public void addCard(Card card) {
        cardsDeck.add(card);
    }

    public Card drawTopCard() {
        return cardsDeck.pop();
    }

    public boolean isCardsDeckEmpty() {
        return cardsDeck.isEmpty();
    }

}
