package Adam19112022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        //how to create an arraylist
       /* ArrayList<String> cities=new ArrayList<>();
        ArrayList<String>fruits=new ArrayList<>();
        //how to add element in arraylist
        cities.add("London");// returns boolean
        cities.add("Paris");
        cities.add("istanbul");
        cities.add("Rome");
        //how to print it
        //for array Arrays.toString(cities);

        System.out.println(cities);
        //add element at the beginning
        cities.add(0,"Ankara");
        //how to get element
        cities.add(5,"Newyork");
        System.out.println(cities);
        System.out.println(cities.get(5));
        System.out.println(cities.get(3));
        //how to update element
        cities.set(1,"Urumçi");
        cities.set(2,"Kaşgar");
//learn the index of element
        System.out.println(cities.indexOf("Kaşgar"));
        System.out.println(cities);
//last index of

        fruits.add("apple");
        fruits.add("Melon");
        fruits.add("Strawberry");
        System.out.println(fruits);
        fruits.add(0,"peach");
        fruits.add(3,"pear");
        fruits.set(2,"Watermelon");
        System.out.println(fruits);
        System.out.println(fruits.lastIndexOf(2));

        */

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int a=3;
        System.out.println("***********************");
        System.out.println(numbers.remove(a));
        ArrayList<Integer>number3=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<String>list3=new ArrayList<String>();

        System.out.println(number3);
        System.out.println("*****************EAST TURKISTAN LONG LIVE*******************");
        ArrayList<String> countries=new ArrayList<>(Arrays.asList("Türkiye","East Türkistan","USA","CANADA","SAUDI ARABIA"));
        countries.add(2,"Pakistan");
        System.out.println(countries);
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        System.out.println(list1);

    }



}

