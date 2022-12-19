package day38_Inheritance.CarTask;

public class CarTEST {
    public static void main(String[] args) {
Toyota toyota=new Toyota("Camry","fume",2022,0,800000);
Tesla tesla=new Tesla("Tesla","Akıl","white",2023,0,800000);
BMW bmw=new BMW("X7","Black",2023,0,1000000);
toyota.start();
tesla.start();
bmw.start();
    }
}
