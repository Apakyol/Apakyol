package week05_10_08_2022;
import java.util.Scanner;
import java.util.logging.LoggingPermission;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
        System.out.println("please enter first number");
        double number1=scanner.nextDouble();
        System.out.println("please enter second number");
        double number2=scanner.nextDouble();
        System.out.println("please enter your operator");
        char oparator=scanner.next().charAt(0);
        double result=0;
        switch (oparator){
            case'+':
                result=number1+number2;
                System.out.println("result = " + result);
                break;
            case'-':

                result=number1-number2;
                break;
            case'*':
                result=number1*number2;
                break;
            case'/':
                System.out.println(result);




        }
    }

}
