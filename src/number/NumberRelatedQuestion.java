package number;

public class NumberRelatedQuestion {
    public static void main(String[] args) {
        int n=2;
        // primeNumber(13);
       // primeNumber();
          table(n);
       // evenNumber(n);
       // factorial(n);
        //  reverse(n);
       //  Armstrong(n);
      //  printPalindrome(n);

    }

    // primeNumber
    private static void primeNumber() {
        int flag=0;
//        if(n==0 || n==1){
//            System.out.println("not a prime number");
//        }else if(n%2==0){
//            System.out.println("not a prime number");
//            flag++;
//        }else if(flag==0){
//            System.out.println("is prime");
//        }


        for(int i=0;i<=100; i++){
            if(i==0 || i==1 ||i%2==0) {
            }else{
                System.out.println(i+" : is prime");
                flag++;
            }
        }
        System.out.println("Total number of prime numbers are " + flag);
    }

    // table
    private static void table(int n) {
        int temp=n;
        int mul=1;
        for (int i=1; i<=10; i++) {
            mul=temp*i;
            System.out.println(mul);
        }

    }


    // prime number
    private static void evenNumber(int n) {

//        for (int i=1; i<=100; i++) {
//            if (i%2==0) {
//                System.out.println(i+" is even number");
//            }
//        }

        if(n%2==0) {
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }
    }

    // Factorial number
    private static void factorial(int n) {
        int rem;
        int fact = 1;
        int temp=n;

       while (temp != 1){
           rem = temp %10;
           fact=fact*rem;
           temp--;
       }
        System.out.println(fact);
    }

    // reverse number
    private static void reverse(int n) {
        int temp = n;
        int rev=0;
        System.out.print("reverse number is: ");

        while (temp != 0){
            rev=temp%10;
            System.out.print(rev);
            temp=temp/10;
        }
    }

    // Armstrong number
    private static void Armstrong(int n) {
        int temp1=n;
        int remender;
        int length=0;
        int temp=n;
        int arm=0;

        while (temp1 !=0){
            temp1=temp1/10;
            length=length+1;
        }

        while (temp !=0){
            int multi=1;
                remender=temp%10;
                for (int i=0; i<length; i++){
                    multi=multi*remender;
                }
               arm=arm+multi;
                temp=temp/10;
        }
        if (arm==n){
            System.out.println(n+" is armstrong number");
        }
        else{
            System.out.println(n+" is notstrong number");
        }

    }


    // Palindrome Number

    private static void printPalindrome(int n){

        int temp = n;
        int rev = 0;
        while (temp !=0){
            int rem;
            rem=temp%10;
            rev= (rev*10)+rem;
            temp= temp/10;

        }
        if (rev==temp){
            System.out.println("the given number is a palindrome");
        }else {
            System.out.println("the given number is not a palindrome");
        }
    }


    //


}
