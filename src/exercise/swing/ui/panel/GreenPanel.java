package exercise.swing.ui.panel;

import javax.swing.*;
import java.awt.*;

public class GreenPanel extends JPanel {
    public GreenPanel() {
        JLabel label = new JLabel();
        label.setText("Riski");
        label.setForeground(Color.WHITE);
        label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        String s = "safasf";

        this.setBackground(Color.GREEN);
        this.setBounds(0, 250, 500,250);
        this.setLayout(new BorderLayout());
        this.add(label);
    }
}
