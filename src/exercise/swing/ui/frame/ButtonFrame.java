package exercise.swing.ui.frame;

import exercise.swing.ui.button.MyButton;

import javax.swing.*;

public class ButtonFrame extends JFrame {

    public ButtonFrame() {
        MyButton button = new MyButton();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
}
