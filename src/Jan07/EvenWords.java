package Jan07;

import java.util.Locale;

public class EvenWords {
    public static void main(String[] args) {

        String org = "hello world this is a test";

       evenString(org);

    }
    static void evenString(String org){
        String[] words = org.split(" ");

        for(String word : words) {
            if(word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
