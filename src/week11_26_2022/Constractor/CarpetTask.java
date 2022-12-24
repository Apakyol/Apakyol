package week11_26_2022.Constractor;

public class CarpetTask {
    public static void main(String[] args) {
        Carpet carpet=new Carpet(3,2,1000,true);
        Carpet carpet1=new Carpet(3,4,600,false);
        System.out.println(carpet1);
        System.out.println(carpet);
    }
}
