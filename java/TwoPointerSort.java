package Array;

import java.util.Arrays;

public class TwoPointerSort {
    public static void twopointer(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            if (arr[left] > arr[right]) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            left++;  // Move left pointer forward
            right--; // Move right pointer backward
        }

        // Print sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 0};
        twopointer(arr);
    }
}
