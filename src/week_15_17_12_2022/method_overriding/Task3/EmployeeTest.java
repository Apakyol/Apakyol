package week_15_17_12_2022.method_overriding.Task3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee=new Employee();
        System.out.println("Employee Salary "+ employee.salary());

        System.out.println("**************");
        Manager manager=new Manager();
        System.out.println("Manager salary is: "+manager.salary());

        System.out.println("*************");
        Clerk clerk=new Clerk();
        System.out.println("Clerk salary is:"+clerk.salary());
    }
}
