package org.example;

import java.util.Scanner;

public class Snap extends CardGame{
    private final Scanner scanner = new Scanner(System.in);
    protected int card = 0;
    public Snap() {

    }

    public void playSnap(int num) {
        if (card < 52 ) {
            shuffleDeck();
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Snap snap = new Snap();
        snap.playSnap(5);
    }

}
