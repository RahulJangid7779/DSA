import java.util.Arrays;

public class radixsort {

    // Function to get the maximum value in the array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Counting sort for a specific digit represented by exp (10^i)
    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // output array that will hold the sorted order
        int[] count = new int[10]; // count array for digits (0 to 9)

        // Count occurrences of digits at the current exp position
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Transform count array such that count[i] now contains actual 
        // position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array by placing numbers in the correct order
        // Iterate from the end to maintain stability
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy the sorted values back to the original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Main function that implements Radix Sort
    public static void radixSort(int[] arr) {
        // Find the maximum number to know the number of digits
        int max = getMax(arr);

        // Do counting sort for every digit, starting with the least significant digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original Array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
