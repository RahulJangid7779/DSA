package Array;
import java.util.*;

public class kadanes_algo {
  public static void main(String[] args) {
    int[] arr = {1, -2, 3, 4, -4, 5, 6};
    int al = arr.length;

    int currSum = 0;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < al; i++) { 
      currSum += arr[i];
      max = Math.max(currSum, max);
      
      // Reset currSum if it goes negative
      if (currSum < 0) {
        currSum = 0;
      }
    }

    System.out.println("Max subarray sum is: " + max);
  }
}
// time complex is O(n)
// space complex is O(1)