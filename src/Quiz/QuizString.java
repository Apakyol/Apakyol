package Quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizString {
    public static void main(String[] args) {

        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta + tb;

        ta = ta + tb;
        ta = ta.replace("C", "D");
        String str3 = " Batch 22 ";
        int b = str3.length();
        int a = str3.trim().length();
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 = s2);
        System.out.println(s1 == s2);

        System.out.println(a + b);
        System.out.println(ta);
        System.out.println("a" + (0 + 1));
        System.out.println("b" + (1 + 2));
        long z = 30L;
        long y=(int)z;
        int x=(int) z;
        double s=z;
        byte t= (byte) x;
        int p=t;
        ArrayList casting=new ArrayList<>(Arrays.asList(z,y,x,t,p));
        System.out.println(casting);
        System.out.println(z);
        System.out.println(y);
        System.out.println(s);
    }
}
