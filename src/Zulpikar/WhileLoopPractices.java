package Zulpikar;

import java.util.Scanner;

public class WhileLoopPractices {
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();
    }

    public static void one() {
        int count = 1;
        while (count <= 10) {
            count *= 2;
        }
        count = count - 10;
        System.out.println("count= " + count);
    }

    public static void two() {
        int count = 100;
        while (count < 100) {
            count = count + 1;
        }
    }

    public static void three() {
        int i = 1;
        do {
            if (i % 2 == 0)
                System.out.print(" " + i);
            // if we cancel i++ in below, this will become a infinite loop
            i++;
        } while (i < 11);
    }

    public static void four() {
        for (int i = 1; i < 50; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.println("*************");
            System.out.println(i);
        }
    }

    // print only vowels in given word
    // a, e, i, o, u   home
    public static void five() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String result = "";

        for (int i = 0; i < alphabet.length(); i++) {
            char ch = alphabet.charAt(i);
            if (ch == 'a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                result += ch;
            }

        }
        System.out.println(result);
    }
    public static void six(){
       //while loop password checker, 3 guess
      String password="Cydeo123!";
        Scanner scanner=new Scanner(System.in);
        int guessNo=0;
      while (true){
          System.out.println("please enter your password");
          String guess=scanner.nextLine();

          if (guess.equals(password)){
              System.out.println("Welcome to Cydeo");
              break;
          }
          guessNo++;
          if (guessNo==3){
              System.out.println("Your account is deactivated");
              break;
          }
      }
    }

}
