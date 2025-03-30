public class findmissingnnumberinarray {
  public static void main(String[] args) {
      int[] arr = {1, 2, 4, 5}; // Missing 3
      int n = arr.length + 1; // Since one number is missing

      // Calculate expected sum
      int expectedSum = (n * (n + 1)) / 2;

      // Calculate actual sum
      int actualSum = 0;
      for (int num : arr) {
          actualSum += num;
      }

      // Missing number
      int missingNumber = expectedSum - actualSum;

      System.out.println("Missing Number: " + missingNumber);
  }
}
