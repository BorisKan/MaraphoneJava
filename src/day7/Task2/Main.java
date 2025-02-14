package day7.Task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[30];
        Random rn = new Random();
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(rn.nextInt(100 - 90) + 90);

        }
    }
}
