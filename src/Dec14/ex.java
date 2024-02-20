package Dec14;

public class ex {
    static String a = "a";

   static String b = "b";

   static void myName(){
       System.out.println("static");
   }

    void MyPrint(){
         String b = "b";
        System.out.println(b);

    }


    public static void main(String[] args) {

       ex ap = new ex();
       ap.MyPrint();



    }
}
