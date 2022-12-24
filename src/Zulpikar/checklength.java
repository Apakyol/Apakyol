package Zulpikar;

public class checklength {
    public static void main(String[] args) {
        checklength();
        trimmethod();
        indexMethod();
        substringMethod();
        equalsMethod();
        startsOrEnds();
        nameGenerator();
    }

    public static void checklength(){
        System.out.println("ssssssssssssssssssssssssssssssssssssssssss".length());
    }
    public static void trimmethod(){
        System.out.println(" sssss ssssss ssssss   sssss".trim());
        System.out.println(" ssssss sssssss.sssss.ssssss   sss".replace(" ",""));
    }
    public static void indexMethod(){
        String data="hello world";
        System.out.println(data.indexOf("o"));
        System.out.println(data.lastIndexOf("o"));
        System.out.println(data.indexOf('o'));
        System.out.println(data.lastIndexOf('o'));
    }
    public static void substringMethod(){
        String data="this is free East Turkistan";
        String subData1=data.substring(5);
        String subData2=data.substring(5,10);
        System.out.println(subData2);
        System.out.println(subData1);

    }
    public static void equalsMethod(){
        String data="Practice";
        String data1="practice";
        System.out.println(data.equals(data1));
        System.out.println();
    }
    public static void startsOrEnds(){
        String data="adfadsf";
        System.out.println(data.startsWith("fa"));
        System.out.println(data.startsWith("A"));
    }
    public static void nameGenerator(){
        String firstName="Robert";
        String SecondName="Down";
        String lastName="Junior";
        System.out.println(firstName.charAt(0)+"."+SecondName.charAt(0)+"."+lastName);
        System.out.println(firstName.substring(0,1)+"."+SecondName.substring(0,1)+"."+lastName);
    }

}
