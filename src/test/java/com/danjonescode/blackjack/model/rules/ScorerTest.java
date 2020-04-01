package com.danjonescode.blackjack.model.rules;

import static org.junit.Assert.assertEquals;

import com.danjonescode.blackjack.model.card.Card;
import com.danjonescode.blackjack.model.card.Rank;
import com.danjonescode.blackjack.model.card.Suit;
import com.danjonescode.blackjack.model.hand.Hand;

import org.junit.Before;
import org.junit.Test;

public class ScorerTest {

    private Scorer scorer;
    private Hand hand;

    @Before
    public void setup() {
        scorer = new Scorer();
        hand = new Hand(scorer);
    }

    @Test
    public void testCountHandWithAceOver21_AceBecomes1() {
        hand.addCard(new Card(Suit.CLUBS, Rank.ACE));
        hand.addCard(new Card(Suit.CLUBS, Rank.TEN));
        hand.addCard(new Card(Suit.CLUBS, Rank.TEN));

        assertEquals(21, hand.getScore());

    }

    @Test
    public void testCountHandWithAce21_AceIs11() {
        hand.addCard(new Card(Suit.SPADES, Rank.ACE));
        hand.addCard(new Card(Suit.CLUBS, Rank.TEN));

        assertEquals(21, hand.getScore());
    }

    @Test
    public void testFaceCardsEqual10() {
        hand.addCard(new Card(Suit.CLUBS, Rank.KING));

        assertEquals(10, hand.getScore());
    }
}