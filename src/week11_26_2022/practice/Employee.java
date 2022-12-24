package week11_26_2022.practice;

public class Employee {
    public String name;
    public char gender;
    public String jobtitle;
    public double salary;

    public Employee(String name, char gender, String jobtitle, double salary){
        this.name=name;
        this.gender=gender;
        this.jobtitle=jobtitle;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
