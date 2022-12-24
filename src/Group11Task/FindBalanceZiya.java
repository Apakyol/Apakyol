package Group11Task;
import java.util.Scanner;
public class FindBalanceZiya {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter numbers");
        int []nums={input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int balanceIndex=0;
        for (int i=0; i<nums.length; i++){
            if (leftIndex(nums,i)==rightIndex(nums,i)){
                balanceIndex=i;
            }
        }
        System.out.println("Balance no index is: "+balanceIndex);
    }
    public static int leftIndex(int[]nums, int index){
        int total=0;
        for (int i=0; i<index; i++){
            total+=nums[i];
        }
        return total;
    }
    public static int rightIndex(int[]nums, int index){
        int total=0;
        for (int i=index+1; i<nums.length; i++){
            total+=nums[i];
        }
        return total;
    }
}
