package Day25Task;

public class Task1 {
    public static void main(String[] args) {
        /*
        1. create a method that can merge two integer arrays.
2. create a method that can merge two double arrays.
3. create a method that can merge two char arrays.
4. create a method that can merge two String arrays.
         */
        int[]arr1={1,2,3,4};
        int[]arr2={5,6,7,8};
    }
    public static int[]merge(int[]arr1, int[]arr2){
        int[]result=new int[arr1.length+arr2.length];
        int i=0;
        for (int each:arr1){
            result[i++]=each;
        }
        return result;
    }

}
