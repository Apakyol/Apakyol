package day38_Inheritance.CarTask;

public class BMW extends Car{
    public BMW(String model, String color, int year, int mile, double price) {
        super("BMW", model, color, year, mile, price);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down every 100 miles");
    }
    public void racing(){
        System.out.println(brand+" "+model+" is a racing car");
    }
}
