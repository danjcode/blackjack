package com.danjonescode.blackjack.model.deck;

import com.danjonescode.blackjack.model.card.*;

public class Deck {

    private final int sizeOfOneDeck = 52;
    private final Card[] cards;
    private int deckPointer = 0;


    public Deck() {
        this(1);
    }

    public Deck(int numberOfDecks) {
        cards = buildPlayableDeck(new Card[sizeOfOneDeck *numberOfDecks]);
    }

    private Card[] buildPlayableDeck(Card[] cards) {
        int cardCounter = 0;
        
        while (cards[cards.length - 1] == null) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cards[cardCounter++] = new Card(suit, rank);
                }
            }
        }

        return cards;
    }

    public Card dealCard() throws NoMoreCardsException {
        if (deckPointer == cards.length) {
            throw new NoMoreCardsException();
        }
        
        return cards[deckPointer++];
    }

    public void resetDeckPointer() {
        deckPointer = 0;
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card.getRank().getName() + " of " + card.getSuit().getName());
        }
    }
}