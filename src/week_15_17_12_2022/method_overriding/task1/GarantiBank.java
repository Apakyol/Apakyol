package week_15_17_12_2022.method_overriding.task1;

public class GarantiBank extends Bank{

    @Override
    public void calculateTheInterest() {
        super.calculateTheInterest();
        System.out.println(getCapital() * 8 / 100);
    }
    private int calculator(){
        return getCapital()*8/100;
    }
}
