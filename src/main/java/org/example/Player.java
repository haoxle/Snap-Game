package org.example;

public class Player {
    public String playerOne;


    public String playerTwo;

    public Player(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    public String getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    @Override
    public String toString(){
        return "Player One: " + playerOne + ", & Player Two: " + playerTwo + " has joined the game!";
    }

}
