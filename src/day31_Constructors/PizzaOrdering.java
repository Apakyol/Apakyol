package day31_Constructors;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {


        ArrayList<Pizza>pizzas=new ArrayList<>();
        // create 100 pizza objects: size 'S', cheese topping 2, pepper topping 3
        // create 100 pizza objects:  size 'M', cheese topping 3, pepper topping 4
        // create 100 pizza objects:  size 'L', cheese topping 4, pepper topping 5

        for (int i = 0; i < 100; i++) {
            Pizza smallPizza=new Pizza('S',2,3);
            Pizza mediumPizza=new Pizza('M',3,4);
            Pizza LargePizza=new Pizza('l',4,5);

            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,LargePizza));
        }
        System.out.println("Total number of pizza: "+pizzas.size());
        double totalPrice=0;
        for (Pizza pizza:pizzas) {
            totalPrice += pizza.calcCost();
        }
        System.out.println("totalPrice ="+totalPrice);
        System.out.println("Total number of pizza= "+ pizzas.size());
    }
}
