package week_15_17_12_2022.method_overriding.Task3;

public class Manager extends Employee {
    @Override
    public int salary() {
        //getting the parent base salary
        return super.salary()+20000;
    }
}
