package com.danjonescode.blackjack.model.card;

public enum Suit {
    CLUBS("clubs"),
    DIAMONDS("diamonds"),
    HEARTS("hearts"),
    SPADES("spades");

    private String name;

    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}