package Array;

public class SearchInRotatedSortedArray {
    public static int searchinsorted(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == target) return mid;

            // Check if the left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] < target && arr[high] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1; // Fixed error here
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int target = 4;
        int arr[] = {6, 7, 8, 1, 2, 3, 4}; // A properly rotated sorted array
        int result = searchinsorted(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
