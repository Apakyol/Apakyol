package day38_Inheritance.CarTask;

public class Tesla extends Car{
    public Tesla(String brand, String model, String color, int year, int mile, double price) {
        super(brand, model, color, year, mile, price);
    }
    public void autoPilot(){
        System.out.println(brand+" "+model+"  in auotpilot mode");
    }
}
