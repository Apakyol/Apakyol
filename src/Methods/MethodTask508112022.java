package Methods;

public class MethodTask508112022 {
    public static void main(String[] args) {
        int[]array= {1,1,1,2,3,3,44,45};
        System.out.println();

    }
    public static int frequency(int []arr, int num){
        int frequency=0;
        for (int i:arr){
            if (i==num){
                frequency++;
            }
        }
        return frequency;
    }
}
