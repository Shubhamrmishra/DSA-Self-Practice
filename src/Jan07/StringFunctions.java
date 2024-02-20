package Jan07;

public class StringFunctions {

    public static void main(String[] args) {
        String a = "hello my name is shubham";
        String[] b= a.split(" ");

        for(String word : b) {
            if(word.startsWith("s") && word.endsWith("m")){
                System.out.println(word);
            }
        }

        for (String word : b) {
            if (word.length()==2){
                System.out.println(word);
            }
        }

        for (String word : b) {
            if (word.contains("s")) {
                System.out.println(word);
            }
        }

        for (String word : b) {
            if (word.trim().length()==2) {
                System.out.println(word);
            }
        }



    }
}
