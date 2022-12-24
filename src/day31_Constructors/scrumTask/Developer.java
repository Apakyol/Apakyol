package day31_Constructors.scrumTask;

public class Developer {
    public String name,jobTitle;
    public int employeeId;
    public double salary;

    public Developer(String name, String jobTitle, int employeeId, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeId=" + employeeId +
                ", salary= $" + salary +
                '}';
    }
    public void coding(){
        System.out.println(name+" is coding ");
    }
    public void unitTesting(){
        System.out.println(name+" is unit testing");
    }
    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }

    //coding(), unitTesting(), fixingBug(),
}
