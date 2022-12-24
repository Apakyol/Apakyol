package Day27Task;

public class FindMinimum {
    public static void main(String[] args) {
        /*
        2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers

         */
        System.out.println("the minimum is: "+findminimum(10,11));
    }
    public static int findminimum(int num1, int num2){
        if (num1>num2){
            return num2;
        }else {
            return num1;
        }
    }
}
