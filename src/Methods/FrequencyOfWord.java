package Methods;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = " java java Java pyton tr java";
        String word = "java";
        System.out.println("frequency fo java "+frequencyOfWord(str, word));
    }

    public static int frequencyOfWord(String sen, String word) {
        int j = 0;
        sen = sen.toLowerCase();
        for (int i = 0; i < sen.length(); i++) {
            if (sen.contains(word)) {
                j++;
                sen = sen.replaceFirst(word, "");
            }
        }return j;
    }
}
