package day38_Inheritance.CarTask;

public class Toyota extends Car {

    public Toyota(String model, String color, int year, int mile, double price) {
        super("Toyota", model, color, year, mile, price);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }
    public void start(){
        System.out.println("Twist the key to igntion to start "+" "+model);
    }
}
