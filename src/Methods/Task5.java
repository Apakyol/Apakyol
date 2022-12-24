package Methods;

public class Task5 {
    public static void main(String[] args) {
        int result=diff21(19);
        int result2=diff21(23);
        System.out.println(result);
        System.out.println(result2);
    }



    public static int diff21(int number){
        return  (number<21)?21-number:(number-21)*2;
        /*
                int a=(number<21)?21-number:(number-21)*2;
return a;
         */
    }//21-19=2 return 2
    /*
    diff21(23);// 23-19=4 return 2*2
     */


}
