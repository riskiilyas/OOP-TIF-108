package games.tictactoe.components;

import javax.swing.*;
import java.awt.*;

public class TitlePanel extends JPanel {

    public TitlePanel() {
        setBackground(Color.black);
        setFont(new Font("Ink Free", Font.BOLD, 75));
        setLayout(new BorderLayout());
        setBounds(0, 0, 800, 100);
    }
}
