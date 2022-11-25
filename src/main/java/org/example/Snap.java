package org.example;

import java.util.Scanner;

public class Snap extends CardGame{
    private final Scanner scanner = new Scanner(System.in);

    public Snap() {

    }

    public void playSnap() {
        System.out.println("Player One, enter your name:");
        String nameOne = scanner.nextLine();
        System.out.println("Player Two, enter your name:");
        String nameTwo = scanner.nextLine();
        Player players = new Player(nameOne, nameTwo);
        System.out.println(players.toString());
        System.out.println(players.playerOne + " Press Enter to Draw.");
        while (deck.size() > 0 ) {
            shuffleDeck();
            String input1 = scanner.nextLine();
            if (input1.isEmpty() && discardDeck.size() % 2 == 1) {
                dealCard();
                System.out.println(players.playerTwo + " has taken their turn");
                System.out.println(discardDeck.toString());
            } else if (input1.isEmpty() && discardDeck.size() % 2 == 0) {
                dealCard();
                System.out.println(players.playerOne + " has taken their turn");
                System.out.println(discardDeck.toString());
            } else System.out.println("Hit Enter to play");
            if (discardDeck.size() > 1 && discardDeck.get(discardDeck.size() -1).getValue() == discardDeck.get(discardDeck.size() - 2).getValue() && discardDeck.size() % 2 == 1 && input1.equals("snap")){
                System.out.println(players.playerOne + " won!!!");
                scanner.close();
            }  if (discardDeck.size() > 1 && discardDeck.get(discardDeck.size() -1).getValue() == discardDeck.get(discardDeck.size() - 2).getValue() && discardDeck.size() % 2 == 0 && input1.equals("snap")){
                System.out.println(players.playerTwo + " won!!!");
                scanner.close();
            }
            if (deck.size() == 0) {
                System.out.println("Draw!");
            }
        }
    }

    public static void main(String[] args) {
        Snap snap = new Snap();
        snap.playSnap();
    }

}
