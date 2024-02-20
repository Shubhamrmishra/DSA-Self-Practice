package arrays_Practice;

public class SumOfSubArray {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int key = 6;
        sumOfSubArray(arr, key);

    }

    /**
     * @param arr is an array of int type that contains some number , now we have to find possible sub-array
     *            whose sum is equal to key
     * @param key key should be the sum of the sub-array, in this case when key is 6, then output wil come 4
     *            cuz there are 4 sub-array with the sum of 6
     */
    static void sumOfSubArray(int[] arr, int key) {

        int count=0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]==key){
                count++;
            }else {
                for (int j=0; j<arr[i]; j++){
                    if (arr[i]+arr[j]==key){
                        count++;
                    }
                }
            }
        }
        System.out.println("count: "+ count);
    }
}
