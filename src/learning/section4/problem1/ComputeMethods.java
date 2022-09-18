package learning.section4.problem1;

import java.util.Random;

public class ComputeMethods {
    public double fahrToCel(double fahrenheit) {
        return 5.0/9.0 * (fahrenheit - 32);
    }

    public double hypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    public double rollTwoDices() {
        Random random = new Random();
        return random.nextInt(6) + 1 + random.nextInt(6) + 1;
    }
}
