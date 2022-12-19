package week_15_17_12_2022.method_overriding.Task2;

public class AnimalTest {
    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.move();
        System.out.println("***************");

        Cow cow=new Cow();
        cow.move();
        System.out.println("***********");

        Fish fish=new Fish();
        fish.move();
    }
}
