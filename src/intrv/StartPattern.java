package intrv;

public class StartPattern {

//    private static void pattern(int n){
//        //    *
////            **
////            ***
////            1234
////            *****
////            ******
//        for (int row = 1; row <=n; row++) {
//            for(int col=1; col <=row; ++col) {
//
//                if(row==4){
//                    System.out.print(" "+col);
//
//                }else {
//                    System.out.print(" *");
//                }
//            }
//            System.out.println();
//        }
//    }

    private static void pattern(int n) {

// * * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
//
        for(int row=0; row<=n-1; row++) {
            for (int col=n-1; col>=row; col--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

//       *
//     *   *

    public static void main(String[] args) {

        pattern(6);

    }


}
