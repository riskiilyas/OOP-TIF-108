package games.tictactoe.components;

import javax.swing.*;
import java.awt.*;

public class TextField extends JLabel {

    public TextField() {
        setHorizontalAlignment(JLabel.CENTER);
        setText("Tic Tac Toe");
        setFont(new Font("Ink Free", Font.BOLD, 70));
        setBackground(Color.GREEN);
        setOpaque(true);
    }
}
