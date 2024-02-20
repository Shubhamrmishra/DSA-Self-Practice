package Jan29;

public class CountChar {
    public static void main(String[] args) {
        String value = "shubhamaaa";

        int count = 0;

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c == 'a' || c=='e' ||c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        System.out.println("count: " + count++);


        
    }



}
