package Methods;

public class findSum {
    public static void main(String[] args) {
        System.out.println(findsum(10, 90));
        System.out.println(findsum3(10, 90, 100));
        System.out.println(findsum4(10,100,1000,10000));
    }

    public static int findsum(int num1, int num2) {

        return num1 + num2;
    }

    public static int findsum3(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }

    public static int findsum4(int num1, int num2, int num3, int num4) {

        return num1 + num2 + num3+num4;
    }
}
