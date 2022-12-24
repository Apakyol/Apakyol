package week13_12_13_2022.inheritance;

public class Instagram extends MobileApp {

    public Instagram(double version){
        super("Instagram",version);
    }
    public void postPhoto(){
        System.out.println("The user is posting photo");

    }
    /*
    instead of retype, need to use extends
    keyword and MobileApp
     */
}
