package learning.section5.problem1;

import java.util.Scanner;

public class ColorRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a color code");
        double input = scanner.nextDouble();

        String color = findColor(input);

        if (color == null) {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        } else {
            System.out.println("The color is " + color);
        }

        scanner.close();
    }


    public static String findColor(double wave) {
        if (wave >= 380 && wave <= 450) {
            return "Violet";
        } else if(wave >= 450 && wave <= 495) {
            return "Blue";
        } else if(wave >= 495 && wave <= 570) {
            return "Green";
        }else if(wave >= 570 && wave <= 590) {
            return "Yellow";
        }else if(wave >= 590 && wave <= 620) {
            return "Orange";
        }else if(wave >= 620 && wave <= 750) {
            return "Red";
        } else {
            return null;
        }
    }




}
