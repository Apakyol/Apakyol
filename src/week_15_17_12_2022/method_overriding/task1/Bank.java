package week_15_17_12_2022.method_overriding.task1;

public class Bank {

    private int capital=10000;
    public int getCapital(){
      return capital;
    }
    //how we can get the class name? getClass().getSimpleName())

    public void calculateTheInterest(){
        System.out.println("Interest of the "+getClass().getSimpleName());
    }
}
