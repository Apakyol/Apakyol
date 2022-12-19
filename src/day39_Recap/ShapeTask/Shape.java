package day39_Recap.ShapeTask;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.out.println("Name can not be null");
            System.exit(1);
        }
        if (name.isEmpty()||name.isBlank()){
            System.out.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }
    public double area(){
        return 0;
    }
    public double primeter(){
        return 0;
    }
}
