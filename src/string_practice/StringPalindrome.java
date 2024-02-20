package string_practice;

public class StringPalindrome {
    public static void main(String[] args) {
        String a ="amita";

       String f="";
       String l ="";

       for (int i = 0; i ==0; i++){
           char c=a.charAt(i);
           f=f+c;
       }
       for (int j = a.length()-1; j==a.length()-1;  j--){
           char c = a.charAt(j);
           l=l+c;
       }
       if(f.equals(l)){
           System.out.println("write");
       }else {
           System.out.println("wrong");
        }



    }
}
