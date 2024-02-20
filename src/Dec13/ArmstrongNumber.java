package Dec13;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number" );
        int p= sc.nextInt();
        int n = p;
        int sum = 0;

        while (n > 0) {
            int temp = n%10;
            sum = sum+temp*temp*temp;

            n /= 10;
        }


        if(p==sum){
            System.out.println(sum +" is a Armstrong number");
        }else{
            System.out.println(sum + " is not a Armstrong number");
        }



    }
}
