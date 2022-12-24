package week_16_12_24_2022.exeptions;

import week_15_17_12_2022.method_overriding.Task3.Employee;

public class RunTimeExceptionsExamples {
    static Employee employee;
    public static void main(String[] args) {
        //ArithmeticException
        try {
            for (int i=5; i>=0; i--) {
             System.out.println(60 / i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        try {
            System.out.println(employee.salary());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //NullPointerException
        // NumberFormatException
           /* String str="Adam 123.";
            String s=str.substring(str.indexOf(" ")+1);
            System.out.println(Integer.parseInt(s));

            */

        //ArrayIndexOutOfBoundsException
        int[]array={1,2,3};
        System.out.println(array[2]);

        //StringIndexOutOfBoundsException
        String name="Adem";
        System.out.println(name.charAt(4));
    }
}
