package week06_15_10_2022;

public class WhileAndDoWhile {
    public static void main(String[] args) {
        boolean flag=true;
        int i=0;
        while (flag){
            System.out.println(i++);
            if (i==100){
                flag=false;
            }
        }

    }
}
