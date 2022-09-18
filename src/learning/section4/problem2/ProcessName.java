package learning.section4.problem2;

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String fullname = scanner.nextLine();

        System.out.println("Your name is: " + processName(fullname));;

        scanner.close();
    }

    public static String processName(String fullname) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = fullname.split(" ");

        stringBuilder.append(stringArray[stringArray.length - 1])
                .append(", ").append(stringArray[0].charAt(0)).append('.');

        return stringBuilder.toString();
    }
}
