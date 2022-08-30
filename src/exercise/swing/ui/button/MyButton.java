package exercise.swing.ui.button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener {

    private int x = 200;
    private int y = 100;
    public MyButton() {
        this.setFocusable(false);
        this.addActionListener(this);
        this.setBounds(x,y,100,50);
        this.setText("Click Me");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        randomizeXY();
    }

    private void randomizeXY() {
        x = (int)(Math.random() * 400);
        y = (int)(Math.random() * 400);
        this.setBounds(x,y,100,50);
    }
}
