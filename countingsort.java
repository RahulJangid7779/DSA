public class countingsort {
  public static void countingsort(int[] arr) {
      int largest = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
          largest = Math.max(largest, arr[i]);
      }

      int count[] = new int[largest + 1];

      for (int i = 0; i < arr.length; i++) {
          count[arr[i]]++;  // Fixed the count update
      }

      // Sorting the array using the count array
      int j = 0;
      for (int i = 0; i < count.length; i++) {  // Fixed loop header
          while (count[i] > 0) {
            arr[j] = i;  // Place sorted values back into arr
            j++;
            count[i]--;
          }
      }
  }

  public static void printArray(int[] arr) {
      for (int num : arr) {
          System.out.print(num + " ");
      }
      System.out.println();
  }

  public static void main(String[] args) {
      int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};
      countingsort(arr);
      printArray(arr);  // Print the sorted array
  }
}
