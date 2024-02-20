package arrays_Practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {9,8,5,6,1,11};
        bubble(arr);
    }
    private static void bubble(int[] arr) {

        for (int i=0; i<arr.length; i++) {
            int temp;

            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {

                flag = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;

                }
            }
            if (flag == 1) {
                 break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }




}
