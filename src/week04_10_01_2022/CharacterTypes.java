package week04_10_01_2022;

public class CharacterTypes {

    public static void main(String[] args) {

        char ch = 'b';
        boolean isUpperCase = ch >= 'A' && ch <= 'Z';
        boolean isLowerCase = ch >= 'a' && ch <= 'z';
        boolean isNotAlphabetic = !(isUpperCase || isLowerCase);
        // !isUpperCase&&!isLowerCase
        if (isUpperCase) {
            System.out.println(ch + " is an UpperCase character");
        }
        if (isLowerCase) {
            System.out.println(ch + " is an LowerCase character");
        }
        if (isNotAlphabetic) {
            System.out.println(ch + " is Not an Alphabetic character");

        }
    }
}