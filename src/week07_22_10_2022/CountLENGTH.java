package week07_22_10_2022;
import java.util.Scanner;
public class CountLENGTH {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter a sentence");
        String input=scan.next();
        int CountLength=input.length();
        System.out.println("CountLength = " + CountLength);
    }
}
