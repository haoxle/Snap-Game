package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    private final Scanner scanner = new Scanner(System.in);


    public void playSnap() {
        System.out.println("Welcome to Snap!" + "\n" + "Instructions: Each player will take their turn by pressing enter, when the card number matches, enter the word 'snap'." + "\n" + "If the player enters snap before the 4 second timer, they win, otherwise they lose." + "\n");
        System.out.println("Player One, enter your name:");
        String nameOne = scanner.nextLine();
        System.out.println("Player Two, enter your name:");
        String nameTwo = scanner.nextLine();
        Player players = new Player(nameOne, nameTwo);
        System.out.println(players.toString());
        System.out.println(players.playerOne + " Press Enter to Draw.");

        while (deck.size() > 0) {
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

            if (discardDeck.size() > 1 && discardDeck.get(discardDeck.size() - 1).getValue() == discardDeck.get(discardDeck.size() - 2).getValue() && discardDeck.size() % 2 == 1) {
                System.out.println("enter snap to win");
                long startTime = System.currentTimeMillis();
                String snap = scanner.next();
                long stopTime = System.currentTimeMillis();
                long reactionTime = stopTime - startTime;
                if (snap.equals("snap") && reactionTime < 4000) {
                    System.out.println("SNAP!!!");
                    System.out.println("You win " + players.playerTwo);
                    System.exit(0);
                } else if (reactionTime > 4000) {
                    System.out.println("you lose " + players.playerTwo);
                    System.exit(0);
                }
            }
            if (discardDeck.size() > 1 && discardDeck.get(discardDeck.size() - 1).getValue() == discardDeck.get(discardDeck.size() - 2).getValue() && discardDeck.size() % 2 == 0) {
                System.out.println("enter snap to win");
                long startTime = System.currentTimeMillis();
                String snap = scanner.next();
                long stopTime = System.currentTimeMillis();
                long reactionTime = stopTime - startTime;
                if (snap.equals("snap") && reactionTime < 4000) {
                    System.out.println("SNAP!!!");
                    System.out.println("You win " + players.playerTwo);
                    System.exit(0);
                } else if (reactionTime > 4000) {
                    System.out.println("you lose " + players.playerTwo);
                    System.exit(0);
                }
            }
            if (deck.size() == 0) {
                System.out.println("Draw!");
                System.exit(0);
            }
        }
    }


}
