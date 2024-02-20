package arrays_Practice;

import java.util.Arrays;

public class SwapAndReverse {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        reversedArray(arr);


        System.out.println(Arrays.toString(arr));
    }

     static void reversedArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while (start < end) {
            swapArray(arr, start, end);
            start++;
            end--;
        }
    }
    static void swapArray(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }


}
