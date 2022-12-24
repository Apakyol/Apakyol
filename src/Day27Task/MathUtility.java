package Day27Task;

public class MathUtility {
    /*
    1. Create a class called MathUtility under the utility package:
2.1 Create a method that can return the sum
of two integers
2.2 Create a method that can return the sum
of two decimal numbers
2.3 Create a method that can return the
subtraction of two integers
2.4 Create a method that can return the
subtraction of two decimals
2.5 Creata a method that can return the
multiplication of two integers
2.6 Creata a method that can return the
multiplication of two decimals
     */
    public static void main(String[] args) {

        System.out.println(sumofnumbers(10, 20));
        System.out.println(sumofnumbers(2.5, 5.5));
        System.out.println(subofnumbers(225, 15));
        System.out.println(multofnumbers(25, 25));
        System.out.println(devofnumbers(10.5, 10.5));

    }

    public static int sumofnumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static double sumofnumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static int subofnumbers(int num1, int num2) {
        return num1 / num2;
    }

    public static int multofnumbers(int num1, int num2) {
        return num1 * num2;
    }

    public static double devofnumbers(double num1, double num2) {
        return num1 / num2;
    }
}
