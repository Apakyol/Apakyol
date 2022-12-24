package Zulpikar;

public class CreateTestSet {
    public static void main(String[] args) {

        String str="1-16 of 462 results for";
        str=str.substring(str.indexOf("of ")+3,str.indexOf(" r"));
        System.out.println(str);
        int strAsInteger=Integer.parseInt(str);
        System.out.println("strAsInteger= "+ (strAsInteger+1));


    }
}
