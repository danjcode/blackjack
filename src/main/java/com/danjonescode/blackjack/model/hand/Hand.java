package com.danjonescode.blackjack.model.hand;

import java.util.ArrayList;
import java.util.List;

import com.danjonescode.blackjack.model.card.Card;
import com.danjonescode.blackjack.model.rules.Scorer;

public class Hand {

    private int score = 0;
    private Scorer scorer;

    private List<Card> cards;

    public Hand(Scorer scorer) {
        this.cards = new ArrayList<>();
        this.scorer = scorer;
    }

    public void addCard(Card card) {
        cards.add(card);
        updateScore();

    }

    public void printHand() {
        for (Card card : cards) {
            System.out.println(card.toString());
        }
    }

    public Card[] getHandCards() {
        Card[] ret = new Card[cards.size()];
        cards.toArray(ret);
        return ret;
    }

    private void updateScore() {
        score = scorer.score(getHandCards());
    }

    public int getScore() {
        return this.score;
    }
}