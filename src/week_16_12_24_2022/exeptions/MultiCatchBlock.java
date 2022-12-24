package week_16_12_24_2022.exeptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
        }
        try {
            System.out.println(9/8);
            Integer.parseInt("123.0");
        }catch (ArithmeticException e){
            System.out.println("You got the Arithmetic exception");
        }catch (NumberFormatException e){
            System.out.println("You have a problem with your number");
        }catch (Exception e){
            System.out.println("I dont know your exception");

        }
    }
}
