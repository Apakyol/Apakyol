package week_15_17_12_2022.method_overriding.Task2;

public class Fish extends Animal{
    @Override
    public void move(){
        super.move();
        System.out.println("Fishes are flying");
    }
}
