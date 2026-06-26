public class SearchAlmostSortedArray {
    
    public static int searchArray(int[] arr) {
        int length = arr.length;
        int start = 0;
        int end = length - 1;
        int target = 10;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid+1] == target) {
                return mid+1;
            }
            else if (arr[mid-1] == target) {
                return mid-1;
            }
            
            else if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
           
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3,5,10,9,11};

        int result = searchArray(arr);
        if (result == -1) {
            System.out.println("Element not found ");
        } else {
            System.out.println("Element found at: " + result + "th index");
        }

    }
}

