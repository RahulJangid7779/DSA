public class LongestSubarrayBruteForce {
  public static void main(String[] args) {
      int[] arr = {1, 2, 3, 1, 1, 1, 1};
      int k = 3;
      int n = arr.length;
      int maxLength = 0;

      for (int start = 0; start < n; start++) {
          int sum = 0;
          for (int end = start; end < n; end++) {
              sum += arr[end];
              if (sum == k) {
                  int length = end - start + 1;
                  maxLength = Math.max(maxLength, length);
              }
          }
      }

      System.out.println("Longest subarray length with sum " + k + ": " + maxLength);
  }
}
