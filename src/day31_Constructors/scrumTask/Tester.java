package day31_Constructors.scrumTask;

public class Tester {
    public String name,jobTitle;
    public int employeeId;
    public double salary;

    public Tester(String name, String jobTitle, int employeeId, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeId=" + employeeId +
                ", salary= $" + salary +
                '}';
    }
    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

}
