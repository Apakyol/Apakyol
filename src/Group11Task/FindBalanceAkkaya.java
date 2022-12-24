package Group11Task;

public class FindBalanceAkkaya {
    public static void main(String[] args) {
        int array[] = {4, 9, 10, 5,1 ,10, 5,3, 6, 4};

        int sumFirst = 0;
        for (int i = 0; i < array.length; i++) {
            int sumLast = 0;
            sumFirst+=array[i];
            for (int j = array.length - 1; j > i+1; j--) {
                sumLast+=array[j];
            }
            if (sumFirst == sumLast){
                System.out.println(i+1);
            }
        }


    }


}
