package week_15_17_12_2022.method_overriding.task1;

public class AkBank extends Bank{

    @Override
    public void calculateTheInterest() {
        super.calculateTheInterest();
        System.out.println(getCapital() * 7 / 100);
    }
}
