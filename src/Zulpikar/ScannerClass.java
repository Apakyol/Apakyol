package Zulpikar;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {

       /* Scanner input=new Scanner(System.in);
        System.out.println("pls enter your name:");
        String name=input.nextLine();
        System.out.println("name is "+ name);

        System.out.println("please enter your age");
        int age= input.nextInt();
        System.out.println("your age is: "+ age);


        Scanner scan=new Scanner(System.in);
        System.out.println("enter your full name");
        String fullname= scan.nextLine();
        System.out.println("My full name is: "+ fullname);

        */
Scanner scan= new Scanner(System.in);
        System.out.println("Enter your Browser Name");
String browserName=scan.nextLine();
        System.out.println("your browser name is: "+ browserName);

        switch (browserName){
            case "safari":
                System.out.println("your browser name is: "+ browserName);
                break;
            case "opera":
                System.out.println("your browser name is: "+ browserName);
                break;
            case "firefox":
                System.out.println("your browser name is: "+ browserName);
                break;
            case "chrome":
                System.out.println("your browser name is: "+ browserName);
                break;
            default:
                System.out.println("your browser is invalid");
        }

    }
}
