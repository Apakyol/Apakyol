package week11_26_2022.practice;

public class Test101 {
    public Test101(){
        System.out.println("A");
    }
    public Test101(int a){
        this(2.5);
        System.out.println("B");
    }
    public Test101(double c){
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        Test101 obj=new Test101(100);
    }
}
