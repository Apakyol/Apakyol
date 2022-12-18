package day38_Inheritance.CarTask;

public class Car {
public String brand,model,color;
public int year, mile;
public double price;

    public Car(String brand, String model, String color, int year, int mile, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mile = mile;
        this.price = price;
    }
    public void drive(){

    }
    public void start(){

    }
    /*public void fly(){

    } as flying is not the common facility for all types of car currently.
     */

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", mile=" + mile +
                ", price=" + price +
                '}';
    }
}
