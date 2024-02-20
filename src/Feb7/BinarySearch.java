package Feb7;

public class BinarySearch {

    public static void main(String[] args) {


        int [] a = {-4, -1 ,3 , 7, 10,11,33,76,77,88};
        int key = 88;

        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(a, key);

            System.out.println("Element found at index: " + result);
    }

    public int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (key > a[mid]) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }


        return -1;
    }
}
