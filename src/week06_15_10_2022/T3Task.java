package week06_15_10_2022;

public class T3Task {
    public static void main(String[] args) {
        String str = "Java is java everywhere is Java";
        String temp = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            }
            if (str.charAt(i) == ' ') {
                System.out.println(temp);
                temp = " ";
            }
        }
    }
}
