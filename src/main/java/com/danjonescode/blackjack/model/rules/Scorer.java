package com.danjonescode.blackjack.model.rules;

import com.danjonescode.blackjack.model.card.Card;

public class Scorer {

    public int score(Card[] cards) {

        int runningTotal = calculateScore(cards, false);

        if (runningTotal > 21) {
            runningTotal = calculateScore(cards, true);
        }

        return runningTotal;
    }

    private int calculateScore(Card[] cards, boolean isAceLow) {
        int runningTotal = 0;

        for (Card card : cards) {
            runningTotal += CardValue.getValue(card, isAceLow);
        }

        return runningTotal;

    }
}