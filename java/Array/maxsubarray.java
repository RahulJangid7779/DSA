package Array;
import java.util.*;

public class maxsubarray {
  public static void main(String args[]) {
    // Brute force approach for maximum subarray sum
    int[] arr = {1, 2, 3, 4, 5};
    int n = arr.length;
    int maxsum = Integer.MIN_VALUE;  // Stores the maximum subarray sum

    for (int st = 0; st < n; st++) {
      int currSum = 0; // Stores current subarray sum
      for (int end = st; end < n; end++) {
        currSum += arr[end];  // Add current element to sum
        maxsum = Math.max(currSum, maxsum); // Update max sum
      }
    }

    System.out.println("Max sum is " + maxsum);  // ✅ Print max sum correctly
  }
}
