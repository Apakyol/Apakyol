package week07_22_10_2022;

public class T3CountEachWord {
    public static void main(String[] args) {
        String names = "Adam Adam Barry Aysun Aysun";

        String temp="";

        String result="";
        for (int i = 0; i < names.length(); i++) {
            char ch=names.charAt(i);

            //we need to find the word one by one
            if (ch!=' '){
                temp+=ch;
                continue; // we need to find word in order to continue to next statement
            }

            String search = temp;

            //in order to count word
            int counter = 0;

            String dumy=names;

            while (dumy.contains(search)) {
                counter++;
                dumy = dumy.replaceFirst(search, "");
            }
            if (!result.contains(search))
                result+=search + "-"+ counter +" ";

            temp="";


        }


        System.out.println("result = " + result);
    }
}


