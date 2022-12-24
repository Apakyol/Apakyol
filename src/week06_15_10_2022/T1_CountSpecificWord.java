package week06_15_10_2022;

public class T1_CountSpecificWord {
    public static void main(String[] args) {
        String str="java is java everywhere is java";
        String word="java";
        int counter=0;
        for (int i=0; i<str.length(); i++){
            String each=str.substring(i, i+word.length());
            if (each.equalsIgnoreCase(word))
                counter++;
        }

    }
}
