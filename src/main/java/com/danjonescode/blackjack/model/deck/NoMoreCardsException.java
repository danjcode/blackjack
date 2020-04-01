package com.danjonescode.blackjack.model.deck;

public class NoMoreCardsException extends Exception {
    private static final long serialVersionUID = -3813346261581916523L;

    public NoMoreCardsException() {
        super("No more cards in the deck");
    }
}