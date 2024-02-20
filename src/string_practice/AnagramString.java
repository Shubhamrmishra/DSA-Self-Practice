package string_practice;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String a="Hello";
        String b="olleH";

        isAnagramString(a, b);
    }

    private static void isAnagramString(String a, String b) {

     if(a.length() != b.length()){
         System.out.println("not anagram string");
     }else {
         char[] c = a.toCharArray();
         char[] d = b.toCharArray();

         Arrays.sort(c);
         Arrays.sort(d);

         if(Arrays.equals(c, d)){
             System.out.println(" anagram string");
         }else {
             System.out.println(" not anagram string");
         }
     }
    }
}
