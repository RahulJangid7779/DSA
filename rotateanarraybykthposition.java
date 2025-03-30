public class RotateArray {
    // Function to reverse a portion of the array
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate array right by k positions
    public static void rightRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    // Main function
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));
        rightRotate(arr, k);
        System.out.println("Right Rotated Array: " + Arrays.toString(arr));
    }
}
// in left we need to change the condition
// arr.reverse(arr,0,k-1);
// arr.reverse(arr,k,n-1);
// arr.reverse(arr,0,n-1);