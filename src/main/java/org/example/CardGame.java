package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CardGame {

    private final String[] symbols = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final char[] suits = new char[] {'\u2764',  '\u2660','\u2666', '\u2663'  };
    private final int[] values = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    public static ArrayList<Card> deck = new ArrayList<>();


    public CardGame() {
    for (int i = 0; i < suits.length; i++) {
        for (int j = 0; j < symbols.length ; j++) {
                Card card = new Card(suits[i], symbols[j], values[j]);
                deck.add(card);
        }
    }
        System.out.println(deck);
    }

    public void shuffleDeck() {

    }

    public static void main(String[] args) {
        CardGame cards = new CardGame();
        System.out.println();
    }
}
