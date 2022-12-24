package array;
public class ArrayPrinting109 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("---------");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("---------------");
        String[] fruits = {"Abdullah", "Banana", "Apple", "Strawberry", "Pear", "Melon", "Pomegranate"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");

        }
        System.out.println("\t");
        System.out.println("\t");
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.print(fruits[i] + " ");
        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(" ");
        }
        System.out.println("\t");
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.print(fruits[i]+" ");

        }





    }
}
