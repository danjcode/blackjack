package com.danjonescode.blackjack.model.card;

public enum Rank {
    ACE("ace"),
    TWO("two"),
    THREE("three"),
    FOUR("four"),
    FIVE("five"),
    SIX("six"),
    SEVEN("seven"),
    EIGHT("eight"),
    NINE("nine"),
    TEN("ten"),
    JACK("jack"),
    QUEEN("queen"),
    KING("king");

    private String name;

    Rank(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}