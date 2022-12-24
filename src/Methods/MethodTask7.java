package Methods;
import java.util.Arrays;
public class MethodTask7 {
    public static void main(String[] args) {
        int[]arr1={1,2,3};
        int[ ]arr2={4,5,6};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
    public static int[] merge(int[]ar1, int[]ar2){
        int[]result=new int[ar1.length+ar2.length];
        int j=0;
        for (int each:ar1){
            result[j++]=each;
        }
        for (int each: ar2){

        }
        return result;
    }
}

