package Feb7;

public class Pattern {
    public static void main(String[] args) {
        int rows = 5;


        for (int i = 0; i <=rows; ++i) {
            for (int j = 0; j <=i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = rows; i >= 1; --i) {  //For Loop for Row
            for(int j = 1; j <= i; ++j) { //For Loop for Col
                System.out.print("* "); //Prints *

            }

            System.out.println(); //Get to newline

        }



//
//        for (int i = 0; i <=rows; ++i) {
//            for (int j = 0; j <=i; ++j) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
