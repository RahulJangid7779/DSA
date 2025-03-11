package Array;

public class SlidingWindow {
    public static int maxSumSubarray(int[] arr, int window) {
        if (arr.length < window) {
            System.out.println("Window size is larger than array size!");
            return -1; // Handle edge case
        }

        // Step 1: Compute sum of first window
        int current = 0;
        for (int i = 0; i < window; i++) {
            current += arr[i];
        }

        int maxxx = current;

        // Step 2: Slide the window
        for (int j = 1; j <= arr.length - window; j++) {
            current = current - arr[j - 1] + arr[j + window - 1]; // Slide window
            maxxx = Math.max(maxxx, current); // Update max sum
        }

        return maxxx;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 5, 7, 6, 12};
        int windowSize = 4;
        int maxSum = maxSumSubarray(arr, windowSize);
        System.out.println("Maximum sum of subarray of size " + windowSize + " is: " + maxSum);
    }
}
