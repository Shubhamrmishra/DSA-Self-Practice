package Dec11;

public class CommonNumber {
    public static void main(String[] args) {
        int num= 122452;
        int count = 0;
        while(num > 0){

            int temp = num%10;
            if(temp == 2){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }


}
