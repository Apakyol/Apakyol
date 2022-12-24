package week06_15_10_2022;

public class T2 {
    public static void main(String[] args) {
        String str="java is java everywhere is java";
        int counter=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)!=' ')
                counter++;
        }
        System.out.println(counter+1);
    }
}
