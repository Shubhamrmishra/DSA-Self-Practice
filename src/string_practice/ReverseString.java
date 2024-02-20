package string_practice;

public class ReverseString {
    public static void main(String[] args) {
        String s="hello";

        reverseStr(s);
    }
    private static void reverseStr(String s) {
        String str = "";
        for (int i = s.length()-1; i>=0; i--) {
            char c=s.charAt(i);
            str=str+c;
        }
        System.out.println(str);
    }

}
