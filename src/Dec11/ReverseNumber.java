package Dec11;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 18678;

        while (num > 0) {
            int temp = num % 10;
            System.out.print(temp);
            num /= 10;

        }


    }
}