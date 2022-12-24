package Adam19112022;

import java.util.ArrayList;
import java.util.Arrays;

public class DevisibleBy3Hamid {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> result = devisibleBy3(numbers);
        System.out.println(result);
    }

    public static ArrayList<Integer> devisibleBy3(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 3 == 0) {
                result.add(number);
            }
        }return result;
    }
}
