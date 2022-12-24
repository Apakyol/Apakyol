package week11_26_2022.student;

public class Student {
    public String name;
    public int age;
    public long batchNumber;
    public static String school="Cydeo";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        //this(name,age);
    }

    public Student(String name, int age, long batchNumber) {
        //this.name = name;
        //this.age = age;
        this(name,age);
        this.batchNumber = batchNumber;
    }
    public String toString(){
        return "Student{"+"name'"+name+'\''+",age="+age+",batchNumber{"+",scholl= "+school+'}';
    }
}

