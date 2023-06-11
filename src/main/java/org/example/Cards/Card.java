package org.example.Cards;


import org.example.Game.Game;

public abstract class Card {

    private Color color;
    public Card(Color color){
        this.color = color;
    }

    public abstract void activate(Game game);

}
