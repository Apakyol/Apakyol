package week06_15_10_2022;

public class WarmupExercise {
    public static void main(String[] args) {
        String word="code";
        for (int i=0; i<=word.length(); i++){
            String str=word.substring(0, i);
            System.out.println(str);
        }
    }
}
