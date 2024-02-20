package arrays_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LinearInArray {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        linearSearch(arr,7);
    }
    static void linearSearch(Integer[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                System.out.println(key +" is at "+i+" index");
            }
        }
    }



}
