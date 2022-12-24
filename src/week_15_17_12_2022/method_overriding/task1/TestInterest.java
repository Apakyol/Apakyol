package week_15_17_12_2022.method_overriding.task1;

public class TestInterest {

    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.calculateTheInterest();

        AkBank akBank=new AkBank();
        akBank.calculateTheInterest();
        System.out.println("********************");

        GarantiBank garantiBank=new GarantiBank();
        garantiBank.calculateTheInterest();
        System.out.println("****************");
        INGBank ingBank=new INGBank();
        ingBank.calculateTheInterest();
        TestInterest testInterest=new TestInterest();
        System.out.println(testInterest.getClass().getSimpleName());

    }
}
