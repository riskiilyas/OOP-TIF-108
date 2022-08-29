package exercise.swing.ui.label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {
    public MyLabel() {
        // BORDER
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

        // JLABEL
        ImageIcon pic = new ImageIcon("assets/rx.png");
        JLabel jLabel = new JLabel();
        jLabel.setText("Brooo do you even code 0_0");
        jLabel.setIcon(pic);
        jLabel.setHorizontalTextPosition(JLabel.CENTER);
        jLabel.setVerticalTextPosition(JLabel.TOP);
        jLabel.setForeground(Color.WHITE);
        jLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,20));
        jLabel.setIconTextGap(25);
        jLabel.setBackground(Color.CYAN);
        jLabel.setOpaque(true);
        jLabel.setBorder(border);
        jLabel.setVerticalAlignment(JLabel.CENTER);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
    }
}
