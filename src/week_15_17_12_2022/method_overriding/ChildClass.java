package week_15_17_12_2022.method_overriding;

public class ChildClass extends ParentClass {
    //Access modifier should be more visible
    //return type should be same
    //method name should be same
    //parameters should be same

    @Override
   public void move(){
        System.out.println("Bird is flying");

   }
}
