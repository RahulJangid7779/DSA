public class ArraySorted {
    // Recursive function to check if the array is sorted
    public static boolean isSorted(int[] arr, int index) {
        // Base case: if we have reached the end of the array or only one element left
        if (index == arr.length - 1) {
            return true;
        }
        
        // Check if the current element is smaller than or equal to the next element
        if (arr[index] > arr[index + 1]) {
            return false;
        }     
        // Recursively check the rest of the array
        return isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  //  array

        if (isSorted(arr, 0)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}


