package Zulpikar.week9;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        one();

    }
    //1. Write a Java program that creates and ArrayList of Strings and then adds five strings to the
    //list.
    public static void one(){
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("grape");
        fruits.add("pomegranate");
        System.out.println(fruits);

        fruits.remove(0);

        System.out.println(fruits);
        fruits.remove(fruits.size()-2);

        System.out.println(fruits);

    }
}
