package week02_02_09_2022;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class BasicCalculator {



    //3. Create a class named BasicCalculator.
    // write a Java program to print the
    // sum (addition), multiply, subtract,
    // divide and remainder of two numbers.

    public static void main(String[] args) {


        double firstNumber=4;
        double secondNumber=100;
        double devide=firstNumber/secondNumber;
        double multiply=firstNumber*secondNumber;
        double sum=firstNumber+secondNumber;
        double subtract=firstNumber-secondNumber;
        double reminder=firstNumber%secondNumber;

        System.out.println("sum="+sum);
        System.out.println("subtract="+subtract);
        System.out.println("multiply="+multiply);
        System.out.println("devide="+devide);
        System.out.println("reminder="+reminder);
    }

}
