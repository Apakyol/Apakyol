package week13_12_13_2022.inheritance;

public class Facebook extends MobileApp {

    public Facebook(double version){
        super("Facebook",version);
    }
    public void PostAStory(){
        System.out.println("user is posting a story");
    }
}
