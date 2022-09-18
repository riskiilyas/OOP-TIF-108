package learning.section5.problem2;

import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a color code");
        int code = scanner.nextInt();

        while (code < 1 || code > 3) {
            System.out.println("Please input Between (1-3)!");
            code = scanner.nextInt();
        }

        int nextCode = checkLight(code);
        String color = "";

        if (nextCode == 1) {
            color = "Red";
        } else if(nextCode == 2) {
            color = "Green";
        } else {
            color = "Yellow";
        }

        System.out.println("Next Traffic Light is " + color);


        scanner.close();
    }

    public static int checkLight(int code) {
        if (code==1) {
            return 2;
        } else if (code == 2) {
            return 3;
        } else {
            return 1;
        }
    }

}
