package day31_Constructors;

public class Rectangle {
    public int length,width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public double calcArea(){
        return length*width;
    }
    public double calcPerimeter(){
        return 2*(length+width);
    }

}
