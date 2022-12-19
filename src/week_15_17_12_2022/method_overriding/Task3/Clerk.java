package week_15_17_12_2022.method_overriding.Task3;

public class Clerk extends Employee {
    @Override
    public int salary() {
        return super.salary()+10000;

    }
}
