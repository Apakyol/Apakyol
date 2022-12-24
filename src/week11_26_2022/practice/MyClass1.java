package week11_26_2022.practice;

public class MyClass1 {
    public int x;
    public int y;

    public MyClass1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Test{
    public static void main(String[] args) {
        MyClass1 object=new MyClass1(10,20);
        System.out.println(object.x);
        System.out.println(object.y);
    }
}
