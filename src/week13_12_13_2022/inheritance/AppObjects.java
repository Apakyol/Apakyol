package week13_12_13_2022.inheritance;

public class AppObjects {
    public static void main(String[] args) {
        Instagram instagram=new Instagram(5.6);
        System.out.println(instagram);
        instagram.useTheApp(30);

        System.out.println("-------------");

        Discord discord=new Discord(4.5);
        System.out.println(discord);
        discord.useTheApp(60);

        System.out.println("======================");
        Facebook facebook=new Facebook(6.0);
        System.out.println(facebook);
        facebook.useTheApp(180);
        facebook.PostAStory();
        facebook.download();
    }
}
