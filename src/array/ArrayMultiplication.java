package array;

public class ArrayMultiplication {
    public static void main(String[] args) {
        int[][]multiplicationTable=new int[10][10];
        for (int row=1; row<=10; row++){

            for (int col=1; col<=10; col++){
                multiplicationTable[row-1][col-1]=row*col;
                System.out.print(row+" x "+col+"="+row*col+"\t");
            }
            System.out.println();
        }
    }
}
