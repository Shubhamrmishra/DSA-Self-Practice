package Jan16;

public class EachFor {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};

        for (int num: arr) {

            for (int num2: arr) {
                System.out.println(num * num2);
            }
        }
    }
}
