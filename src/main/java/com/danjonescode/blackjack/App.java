package com.danjonescode.blackjack;

import com.danjonescode.blackjack.model.deck.Deck;
import com.danjonescode.blackjack.model.deck.NoMoreCardsException;


public class App {
    public static void main( String[] args ) {
        Deck deck = new Deck(2); 
        
        try {
            while(true) {
                System.out.println(deck.dealCard().toString());
            }
        } catch(NoMoreCardsException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
