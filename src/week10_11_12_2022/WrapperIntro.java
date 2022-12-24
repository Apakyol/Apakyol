package week10_11_12_2022;
import java.util.Arrays;
public class WrapperIntro {
    public static void main(String[] args) {
        //int double char boolean
        int a=2;
        Integer b=122;
        Integer c=new Integer(12);


        String number1="123";
        String number2="200";
        String result=number1+number2;
        System.out.println(result);
        int result1=Integer.parseInt(number1);
        int result2=Integer.parseInt(number2);

        System.out.println(result1+result2);

int i=Integer.parseInt("123");
Integer integer=Integer.valueOf("123");

    }
}
