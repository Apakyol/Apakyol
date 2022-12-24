package Methods;

public class frequencyOfELement {
    public static void main(String[] args){
        int[] arr={1,1,1,11,1,2,2,2,3,3,3,4,4,1,1,1,1};

        int n=frequencyOfELement(arr, 1);
    }
public static int frequencyOfELement(int[]array, int element){
        int count=0;
        for (int each: array){
            if (each==element){
                count++;
            }
        }
        return count;
}
}
