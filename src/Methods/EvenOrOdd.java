package Methods;

public class EvenOrOdd {
    public static void main(String[] args) {
checkNumberEvenOdd(15);
checkNumberEvenOdd(8);
    }
    public static void checkNumberEvenOdd(int number){
        if (number%2==0){
            System.out.println(number+" is even");
        }else {
            System.out.println(number+ " is odd");
        }
    }
}
