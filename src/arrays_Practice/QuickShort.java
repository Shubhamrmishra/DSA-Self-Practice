package arrays_Practice;

import java.util.Arrays;


public class QuickShort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        sortArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr, int low, int high) {

        if(low>high){
            return;
        }
        int s= low;
        int e= high;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];

        while (s<=e){

            while (arr[mid]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct index, please sort two halves now
        sortArray(arr, low, e);
        sortArray(arr, s, high);



    }

}
