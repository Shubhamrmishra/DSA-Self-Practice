package arrays_Practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};

        binarySeachArray(arr, 8);
    }

     static void binarySeachArray(int[] arr, int key) {
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        int temp=0;

        for(int i=start; i<=end; i++) {
            if(arr[i]==key) {
                System.out.println(key+" is at "+i+" index");
                temp=temp+1;
            }else if(arr[mid]<key){
                start = mid+1;
            }else if(arr[mid]>key){
                end=mid-1;
            }
        }
        if(temp==0){
            System.out.println(key+ "  not found");
        }

    }
}
