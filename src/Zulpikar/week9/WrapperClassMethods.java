package Zulpikar.week9;

import java.util.Scanner;

public class WrapperClassMethods {
    public static void main(String[] args) {

       // one();

        //autoboxing
        int a=40;
        Integer b=a;
        //unboxing
        Integer c=50;
        int d=c;

        /*
        1.parseInt(): parse a string and return its integer value
        2.valueOf(): convert a string to an Integer object
        3.toString(): take a int/Integer's string value(convert it to string object)
        4.Integer.max or min: take max or min Integer value
         */

        System.out.println(Integer.toString(123).concat("OneTwoThree")); //"123"

        String str="123house258";
        int total=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
               // total+=Integer.valueOf(str.charAt(i)); change Integer value to String
                total+=Integer.valueOf("" +str.charAt(i));
            }
        }
        System.out.println("total= "+ total);
    }
    public static void one(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a number");
        String number= scanner.nextLine();

        boolean isPositive=false;

        int num=Integer.parseInt(number);
        if (num>=0){
            isPositive=true;
        }
        System.out.println(isPositive);
    }
}
