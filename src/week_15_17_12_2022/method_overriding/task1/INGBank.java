package week_15_17_12_2022.method_overriding.task1;

public class INGBank extends Bank{

    @Override
    public void calculateTheInterest() {
        System.out.println(getCapital() * 9 / 100);
    }
}
