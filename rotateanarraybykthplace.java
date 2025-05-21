import java.util.Arrays;

public class RotateAnArrayByKthPlace {
  
  public static void rotate(int[] arr, int k) {
    int n = arr.length;
    k = k % n;

    reverse(arr, 0, n - 1);     // Step 1: Reverse the whole array
    reverse(arr, 0, k - 1);     // Step 2: Reverse the first k elements
    reverse(arr, k, n - 1);     // Step 3: Reverse the rest
  }

  public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;

    rotate(arr, k);

    System.out.println(Arrays.toString(arr));  // Output: [5, 6, 7, 1, 2, 3, 4]
  }
}
