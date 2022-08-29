package exercise.swing.ui.frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        ImageIcon imageIcon = new ImageIcon("assets/splash.png");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(imageIcon.getImage());
        this.setResizable(false);
        this.setTitle("My Game");
        this.setSize(420,420);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x039BE6));
    }
}
