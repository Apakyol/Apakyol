package Group11Task;
public class FindBalanceWithoutImport {
    public static void main(String[] args) {
        int []nums={4,5,6,3,3,8,9,12};
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

