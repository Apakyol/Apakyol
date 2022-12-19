package week_15_17_12_2022.method_overriding.Task2;

public class Bird extends Animal {
    public void move(){
        super.move();
        System.out.println( "Birds are flying");
        System.out.println(getClass());
    }
}
