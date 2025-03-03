package Array;
import java.util.Arrays;

public class ChocolateDistribution {
  public static int findMinDifference(int[] chocolates, int n, int m) {
    if (m > n) {
      System.out.println("Not enough chocolates for all students.");
      return -1;
    }

    // Step 1: Sort the array
    Arrays.sort(chocolates);

    // Step 2: Find the minimum difference
    int minDiff = Integer.MAX_VALUE;
    for (int i = 0; i + m - 1 < n; i++) {
      int diff = chocolates[i + m - 1] - chocolates[i];
      minDiff = Math.min(minDiff, diff);
    }

    return minDiff;
  }

  public static void main(String[] args) {
    int[] chocolates = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42};
    int students = 5;
    int n = chocolates.length;

    int result = findMinDifference(chocolates, n, students);
    if (result != -1) {
      System.out.println("Minimum difference is: " + result);
    }
  }
}
