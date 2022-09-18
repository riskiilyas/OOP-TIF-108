package games;

import games.flappybird.FlappyBird;
import games.tictactoe.TicTacToe;

public class Main {
    public static void main(String[] args) {
                            double a = 20.5;
        System.out.println((int) a);
    }

    static void playFlappyBird() {
        new FlappyBird();
    }

    static void playTicTacToe() { new TicTacToe(); }
}
