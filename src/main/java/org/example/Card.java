package org.example;

public class Card {


    private String symbols;
//    private int values;
    private char suits;

    private int values;

    public Card(char suits, String symbols, int values) {
        this.suits = suits;
        this.symbols = symbols;
        this.values = values;
    }

//    public int getValue() {
//        return values;
//    }

    public String getSymbol() {
        return symbols;
    }

    public char getSuit() {
        return suits;
    }

    @Override
    public String toString() {
        return (symbols+suits);
    }

}
