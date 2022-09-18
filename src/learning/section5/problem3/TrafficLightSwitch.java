package learning.section5.problem3;

import java.util.Scanner;

public class TrafficLightSwitch {
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

        switch (nextCode) {
            case 1:
                color = "Red";
                break;
            case 2:
                color = "Green";
                break;
            case 3:
                color = "Yellow";
                break;
        }

        System.out.println("Next Traffic Light is " + color);


        scanner.close();
    }

    public static int checkLight(int code) {
        switch (code) {
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 1;
        }
    }
}
