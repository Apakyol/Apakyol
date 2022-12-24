package Methods;

import java.util.Arrays;

public class MethodDeneme {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String st1, String st2) {
        char[] st1Char = st1.toCharArray();
        Arrays.sort(st1Char);
        char[] st2Char = st2.toCharArray();
        Arrays.sort(st2Char);
        return (Arrays.equals(st1Char, st2Char));

        }
    }

