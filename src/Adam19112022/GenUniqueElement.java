package Adam19112022;

import java.util.ArrayList;

public class GenUniqueElement {
    public static void main(String[] args) {
        int[]first={1,2,3,4,5};
        int[]second={4,5,6};
        ArrayList<Integer> result=getUniqueElements(first,second);
        System.out.println(result);
    }
    public static ArrayList<Integer> getUniqueElements(int[] first, int[]second){
        ArrayList<Integer> result=new ArrayList<>();
        for (int i:first){
            result.add(i);
        }
        for (int i:second){
            result.add(i);
        }
        return result;
    }
}
