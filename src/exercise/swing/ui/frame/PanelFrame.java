package exercise.swing.ui.frame;

import exercise.swing.ui.panel.BluePanel;
import exercise.swing.ui.panel.GreenPanel;
import exercise.swing.ui.panel.RedPanel;

import javax.swing.*;

public class PanelFrame extends JFrame {
    public PanelFrame() {
        RedPanel redPanel = new RedPanel();
        BluePanel bluePanel = new BluePanel();
        GreenPanel greenPanel = new GreenPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(750,750);
        this.setVisible(true);
        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
    }
}
