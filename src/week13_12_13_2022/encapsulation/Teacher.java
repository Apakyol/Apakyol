package week13_12_13_2022.encapsulation;

public class Teacher {
    private String name;
    private int id;

    public Teacher(String name, int id) {

        if (name.equals("xxxx")){
            System.out.println("you cannot use this name");
        }else {
            this.name=name;
        }
        if (id<0){
            System.out.println("you cant use this as id");
        }
        this.name = name;
        this.id = id;
    }
}
