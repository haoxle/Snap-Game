package org.example;

public class Card {
    public static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static String[] symbol = {
            null, "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};
    public static int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};


    public Card(String[] suit, String[] symbol, int[] value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public int[] getValue() {
        return value;
    }

    public String[] getSymbol() {
        return symbol;
    }

    public String[] getSuit() {
        return suit;
    }

}
