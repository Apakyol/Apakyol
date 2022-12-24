package Zulpikar.week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListPractice {
    public static void main(String[] args) {
       // one();
        //two();
        //three();
       // four();
        //five();
        six();

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
    public static void two(){
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

    }
    public static void three(){
        ArrayList<Integer> randomNumbers=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(100));

        }
        System.out.println("randomNumbers = " + randomNumbers);
        for (int i = 0; i < randomNumbers.size(); i++) {
            if (randomNumbers.get(i)%2==0){
                randomNumbers.add(randomNumbers.get(i));
            }
            System.out.println(randomNumbers);
        }
    }
public static void four(){
    ArrayList<Integer> randomNumbers= new ArrayList<>();
    Random random=new Random();
    for (int i = 0; i < 10; i++) {
        randomNumbers.add(random.nextInt(100));
    }
    Collections.sort(randomNumbers);
    System.out.println("randomNumbers = " + randomNumbers);
}

public static void five(){
        ArrayList<String> list=new ArrayList<>();

    }
    public static void six(){
      ArrayList<Integer>  nums=new ArrayList<>();
      Random random=new Random();
        for (int i = 0; i <10 ; i++) {
           nums.add(random.nextInt(100));
        }
        System.out.println(nums);
        int max=Collections.max(nums);
        int min=Collections.min(nums);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
