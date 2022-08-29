package exercise.swing.ui.frame;

import exercise.swing.ui.label.MyLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LabelFrame extends JFrame {

    public LabelFrame() {
        // FRAME
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(new MyLabel());
        pack();
    }
}
