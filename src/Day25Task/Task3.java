package Day25Task;

public class Task3 {
    public static void main(String[] args) {
        /*
        1. create a method that can return the min number from an integer
array
2. create a method that can return the min number from double array
3. create a method that can return the min number from long array
4. create a method that can return the min number from short array
5. create a method that can return the min number from float array
6. create a method that can return the min number from byte array
         */

    }
    public static int[]reverse(int[]array){
       
        int reverse[]= new int[array.length];
        int i=0;
        for (int j=array.length-1; j>=0; j--) {
            reverse[i++]=array[j];
        }
            return reverse;
        }
    }

