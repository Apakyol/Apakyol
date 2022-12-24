package array;
import java.util.Arrays;
public class ArrayIntro {
    public static void main(String[] args) {
        String[]names ={"Abdulhamid", "Mihri", "Lale", "Akıl","Abdullah"};
        System.out.println(Arrays.toString(names));
        System.out.println("------------------------");
        int[]numbers={5,4,0,2,1,3};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------");
        char[]arr1={'a','b','c'};
        char[]arr2={'c','a','b'};
        System.out.println(arr2==arr1);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(arr2==arr1);

        System.out.println("          ******************");
        int[] number2=Arrays.copyOfRange(numbers,3,6);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(number2));

    }

}
