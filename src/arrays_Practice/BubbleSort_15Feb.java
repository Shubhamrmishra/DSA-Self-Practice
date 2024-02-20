package arrays_Practice;

import java.util.Arrays;

public class BubbleSort_15Feb {

    public static void main(String[] args) {
        int[] arr={4,2,6,8,1};
        bubbleSort(arr);
    }
    private static void bubbleSort(int[] arr){
        int length= arr.length;

        for(int i=0; i<length; i++){
            for (int j=1; j<length; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
