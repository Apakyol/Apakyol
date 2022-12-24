package array;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        /*int[]arr1={1,2,3};
        int[]arr2={4,5,6};
        int[]arr3={7,8,9};
        int[][]arr2D={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[2]));
        //TO Print 9
        System.out.println(arr2D[2][2]);
        System.out.println("----------");
        String[][]groups={{"Ahmet", "Mehmet"},{"Ali","Sali"},{"Abdullah","Abdurahman","Hamid"}};
        System.out.println(Arrays.toString(groups[2]));
        System.out.println(Arrays.deepToString(groups));
        System.out.println(groups[0][1]);
        System.out.println(Arrays.toString(groups[1]));
        System.out.println(Arrays.deepToString(groups));
        System.out.println(groups[2][0]);


        String word=" Winter is coming  ";
        word=word.trim();
        System.out.println(word.length());


        String a="123";
        String b= (5+4+a);
        System.out.println(b);


        String s="JAVa İS FUN";
        int c=s.charAt(4);
        if (c=='a'){
            System.out.println("A");
        }else if (c==' '){
            System.out.println("B");
        }else {
            System.out.println("C");


        String s="the game was tied at 2-2";
        String s2=s.substring(5);
        System.out.println(s2);
        int index1=s.indexOf("game");
        int index2=s2.indexOf("game");
        if (index1==index2){
            System.out.println(index1);
        }else {
            System.out.println(index2);
         */
        int a=0;
        do {a=a++ + --a -(a%3);

        }while (++a<4);
        System.out.println(a);

        }
    }

