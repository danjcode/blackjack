package com.danjonescode.blackjack.model.rules;

import com.danjonescode.blackjack.model.card.*;

public class CardValue {

    public static int getValue(Card card, boolean isAceLow) {

        switch (card.getRank()) {
            case ACE:
               return isAceLow ? 1 : 11;
                
            case TWO:
                return 2;

            case THREE:
                return 3;

            case FOUR:
                return 4;

            case FIVE:
                return 5;

            case SIX:
                return 6;

            case SEVEN:
                return 7;

            case EIGHT:
                return 8;

            case NINE:
                return 9;

            case TEN:
            case JACK:
            case QUEEN:
            case KING:
                return 10;

            default:
                return 0;
        }
    }
}