package Feb5;

public class IntegerVS_int {


        public static void main(String[] args) {
            int a = 128;
            int b = 128;

            Integer x = 128;
            Integer y = 128;

            if(a == b) {
                System.out.print("Equal");
            } else {
                System.out.println("Not-Equal");
            }

//            if(x.equals(y)) {
                if(x==y) {
                    System.out.print(" Equal");
            } else {
                System.out.print(" Not-Equal");
            }

        }
/*
The answer is B: Equal not-equal.
Explanation: int a, and int b are primitive type variables that can be compared using the == operator, as they hold integer values in a variable.
But when we use Integer type to hold the value of x, JVM converts primitive type into an object of type Integer. hence, x and y are two objects, which must be compared using equals() operator.
if we do x.equals(y) instead of x==y, compiler will print equals for second case as well.
 */

}
