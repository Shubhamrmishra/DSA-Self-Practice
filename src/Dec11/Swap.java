package Dec11;

public class Swap {
    public static void main(String[] args) {

       swap(10, 20);

    }

   static void swap(int a, int b) {
        a = a + b;
        b= a - b;
        a = a- b;

        System.out.println("a = " + a + " b = " + b);

    }
}
