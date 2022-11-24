package org.example;

import java.util.Scanner;

public class Snap extends CardGame{
    private final Scanner scanner = new Scanner(System.in);

    public Snap() {

    }

    public void playSnap() {
        while (deck.size() > 0 ) {
            shuffleDeck();
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                dealCard();
                System.out.println("user has taken their turn");
                System.out.println(deck.toString());
                System.out.println(discardDeck.toString());
            }
            if (discardDeck.size() == discardDeck.size() - 1){
                System.out.println("you win hoe");
                scanner.close();
            }
        }
    }

    public static void main(String[] args) {
        Snap snap = new Snap();
        snap.playSnap();
    }

}
