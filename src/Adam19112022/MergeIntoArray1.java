package Adam19112022;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntoArray1 {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4, 5, 6));
        Integer[]merge=mergeIntoArray(first,second);
        System.out.println(Arrays.toString(merge));
    }

    public static Integer[] mergeIntoArray(ArrayList<Integer> first, ArrayList<Integer> second) {
        Integer[] result = new Integer[first.size() + second.size()];
        int index = 0;
        for (Integer each : first) {
            result[index++] = each;
        }
        System.out.println(index);

        for (Integer integer : second) {
            result[index++] = integer;
        }
        return result;

    }
}

