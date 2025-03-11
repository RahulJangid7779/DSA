package Array;
import java.util.Arrays;

public class prefixsum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Prefix Sum Calculation
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];  // Accumulate sum
        }
System.out.println(Arrays.toString(arr));
        // Print the modified arra
      }
      
    }