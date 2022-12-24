package Methods;

public class OurTrim {
    public static void main(String[] args) {

        String results= ourTrim("  Hello  ");
        System.out.println(results);
    }
    private static String ourTrim(String str){
        String dumy="";

        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if (ch==' ')
                continue;
            dumy+=ch;

        }
        return dumy;
    }
}
