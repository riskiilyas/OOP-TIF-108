package learning.section3;

import javax.swing.*;

public class Practice {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Your Name Please!");

        int age;
        try {
            age = Integer.parseInt(JOptionPane.showInputDialog("Your Age?"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Format. Default age: 20");
            age = 20;
        }

        double cash;
        try {
            cash = Double.parseDouble(JOptionPane.showInputDialog("Your current cash?"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Format. Default cash: 10.0$");
            cash = 10.0;
        }


    }

}
