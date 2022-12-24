package Methods;

import java.util.Arrays;

public class AddElement08112022 {
    public static void main(String[] args) {
int[]str1={1,2,3};
int n=4;
        System.out.println(Arrays.toString(addelement(str1)));
    }
    public static int[]addelement(int[]arr){
        int[] str=new int[arr.length+1];
        int j=0;
        for (int each:arr){
            str[j++]=each;

        }/*str[j]=element;
        return str;*/
        return str;
    }
}
