package games.tictactoe;

import games.tictactoe.components.ButtonPanel;
import games.tictactoe.components.Frame;
import games.tictactoe.components.TextField;
import games.tictactoe.components.TitlePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    Frame frame = new Frame();
    TitlePanel titlePanel = new TitlePanel();
    ButtonPanel buttonPanel = new ButtonPanel();
    TextField textField = new TextField();
    JButton[] buttons = new JButton[9];
    boolean player1Turn;

    public  TicTacToe() {
        titlePanel.add(textField);
        frame.add(titlePanel);
        frame.add(buttonPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: 01/09/2022 implement this method
    }

    public void firstTurn() {

    }

    public void check() {

    }

    public void xWins(int a, int b, int c) {

    }

    public void oWins(int a, int b, int c) {

    }
}
