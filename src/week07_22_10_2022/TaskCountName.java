package week07_22_10_2022;

public class TaskCountName {
    public static void main(String[] args) {
        String str= "Adam Adam Aysun Barry Barry";

String temp="";
String result ="";
for (int i=0; i<str.length(); i++){
    char ch=str.charAt(i);
    if (ch!=' ')
        temp+=ch;
}
String search=temp;
int counter =0;
String dumy=str;
while (dumy.contains(search)){
    counter++;
    dumy=dumy.replaceFirst(search, "");
}
if (!result.contains(search))
     result+=search + "-"+ counter +"";
      temp="";

    }
}
