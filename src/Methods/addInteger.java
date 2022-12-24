package Methods;

import java.util.Arrays;

public class addInteger {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        arr=addInteger(arr,4);
        System.out.println(Arrays.toString(arr));

    }
    public static int[]addInteger(int[]array, int element){
        int[]result=new int[array.length+1];
        int i=0;
        for (int each:array){
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }
}
