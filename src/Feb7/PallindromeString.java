package Feb7;


public class PallindromeString {

    private static boolean isPalindrome(String s2) {
        int i =0;
        int j = s2.length()-1;

        while(i<=j) {
            char c = s2.charAt(i);
            char c2 = s2.charAt(j);

            if(c !=c2){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void solution(String s){
        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<s.length(); j++){
                String s2 =s.substring(i,j);
                if(isPalindrome(s2)==true){
                    System.out.println(s2);
                }
            }
        }
    }



    public static void main(String[] args) {

        solution("abcbc");
    }


}
