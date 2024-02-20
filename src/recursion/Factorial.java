package recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + callFact(n));
    }

    private static int callFact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * callFact(n - 1);
        }
    }
}
