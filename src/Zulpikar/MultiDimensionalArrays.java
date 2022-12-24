package Zulpikar;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[]numbers=new int[5];
        int[][]numbers2d=new int[5][];
        int[][][]numbers3d=new int[5][][];

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers2d));

        numbers[0]=5;
        numbers2d[0]=new int[]{2,3,4};
        numbers2d[1]=new int[]{5,6,7};

        int[]element1={8,9,7};
        numbers2d[2]=element1;

        System.out.println(Arrays.deepToString(numbers2d));
        System.out.println(numbers2d[2][0]);




    }
}
