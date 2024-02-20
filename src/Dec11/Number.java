package Dec11;

public class Number {
    public static void main(String[] args) {
        int n=1;
        numbers(n);
    }

    private static void numbers(int n) {
        if (n <= 10) {
            System.out.println(n);
            numbers(n + 1);
        }
    }
}
