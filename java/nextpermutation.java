import java.util.Arrays;

public class nextpermutation {
    public static void nxtPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;

        // Step 1: Find the pivot (first decreasing element from right)
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot found, reverse the array (smallest permutation)
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the next larger element to swap with pivot
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        // Step 4: Reverse the suffix (right part of pivot)
        reverse(arr, pivot + 1, n - 1);
    }

    // Swap helper function
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse helper function
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5};
        nxtPermutation(arr);
        System.out.println(Arrays.toString(arr)); // Expected Output: [1, 2, 4, 5, 3]
    }
}
