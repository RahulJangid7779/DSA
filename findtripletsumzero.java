import java.util.*;

public class findtripletsumzero {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr); // Step 1: Sort the array

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicates for first element
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println(arr[i] + ", " + arr[left] + ", " + arr[right]);
                    left++;
                    right--;

                    // Skip duplicates for left and right
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } else if (sum < 0) {
                    left++;  // Need larger value
                } else {
                    right--; // Need smaller value
                }
            }
        }
    }
}
