package learning.section4.problem1;

public class TestClass {
    public static void main(String[] args) {
        ComputeMethods computeMethods = new ComputeMethods();

        System.out.println("Temp in Celcius is " + computeMethods.fahrToCel(34));
        System.out.println("Hypotenuse is " + computeMethods.hypotenuse(8,6));
        System.out.println("The sumof the dice values is " + computeMethods.rollTwoDices());
    }
}
