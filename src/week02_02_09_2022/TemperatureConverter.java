package week02_02_09_2022;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("input Fahrenheit Temperature");
       double fahrenheit = input.nextDouble();
       double celcius = (5 * (fahrenheit - 32)) / 9;
       System.out.println("celcius="+celcius);
     }
}

