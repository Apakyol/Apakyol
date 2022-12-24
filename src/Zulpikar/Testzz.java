package Zulpikar;

public class Testzz {
    public static void main(String[] args) {
        int result=method4('z',"zebra");
        System.out.print("result");
    }
    public static int method4(char c, String s){
        if (s.contains(""+c)){
            return 1;
        }else {
            return 0;
        }
    }
}
