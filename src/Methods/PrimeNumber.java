package Methods;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean result = Primenumber(7);
        System.out.println(result);
    }

    public static boolean Primenumber(int number) {
        boolean isPrimenumber = true;
        if (number<2){
            return false;
        }
        for (int i = 2; i<number; i++){
            if (number % i == 0) {
                isPrimenumber = false;
                break;
            }
        }
        return isPrimenumber;
    }
}
