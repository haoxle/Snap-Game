package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {

    private final String[] symbols = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final String[] suits = new String[]{String.valueOf('\u2764'),String.valueOf('\u2660'), String.valueOf('\u2666') , String.valueOf('\u2663')};
    private final int[] values = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    public ArrayList<Card> deck = new ArrayList<>();
    public ArrayList<Card> discardDeck = new ArrayList<>();

    public CardGame() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                Card card = new Card(suits[i], symbols[j], values[j]);
                deck.add(card);
            }
        }
        System.out.println(deck);
    }


    public Card dealCard() {
        Card drawn = deck.get(0);
        deck.remove(drawn);
        discardDeck.add(drawn);
        return drawn;
    }

    public  ArrayList<Card> sortDeckByNumber() {
        Collections.sort(deck, (o1, o2) -> Integer.compare(o1.getValue(), o2.getValue()));
        return deck;
    }

    public  ArrayList<Card> sortDeckBySuits() {
        Collections.sort(deck, (o1, o2) -> CharSequence.compare(o1.getSuit(), o2.getSuit()));
        return deck;
    }

    public  ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deck);
        return deck;
    }

    public static void main(String[] args) {
        CardGame cards = new CardGame();
        System.out.println(cards.dealCard());
        System.out.println(cards.sortDeckByNumber());
        System.out.println(cards.sortDeckBySuits());
        System.out.println(cards.shuffleDeck());
    }
}
