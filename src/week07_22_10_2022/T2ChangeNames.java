package week07_22_10_2022;

public class T2ChangeNames {
    public static void main(String[] args) {

        String str =  "I love cats! I have a cat named Coco. My cat is very smart!";
        while ((str.contains("cat"))) {

            str= str.substring(0,str.indexOf("cat"))+"dog" + str.substring(str.indexOf("cat")+3) ;
        }

        System.out.println(str);
    }


}

