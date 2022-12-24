package Zulpikar;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        String[] names = {"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};

        for (String each : names) {
            String name = "";
            for (char ch : each.toCharArray()) {
                if(Character.isDigit(ch)){
                    name += "" + ch;
                }
            }
            System.out.println(name);
        }

    }
    public static void two(){
        String[]names={"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};
        int total=0;
        for (String name: names) {

        }
    }
}
