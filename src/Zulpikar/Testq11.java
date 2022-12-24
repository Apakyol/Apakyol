package Zulpikar;

public class Testq11 {
    public static boolean method5(String str){
        boolean check=true;
        if (str.isEmpty()){
            check=false;
        }
        if (!str.contains("a")){
            check=false;
        } else if (str.contains("z")) {
            check=false;
        }
        String str1=str.substring(0,1);
        String str2=str.substring(0,2);
        String str3=str.substring(0,3);
        String str4=str.substring(0,4);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        check=str.substring(0,1).equals("a")?check:false;
        return check;
    }

    public static void main(String[] args) {
        System.out.print(method5("apple"));
    }
}
