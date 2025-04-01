public class mergesort {
  // Merge two sorted subarrays
  public static void conquer(int arr[], int si, int mid, int ei) {
      int merged[] = new int[ei - si + 1];
      int idx1 = si, idx2 = mid + 1, x = 0;

      // Merge two sorted halves
      while (idx1 <= mid && idx2 <= ei) {
          if (arr[idx1] <= arr[idx2]) { 
              merged[x++] = arr[idx1++];
          } else {
              merged[x++] = arr[idx2++];
          }
      }

      // Copy remaining elements from the left subarray
      while (idx1 <= mid) {
          merged[x++] = arr[idx1++];
      }

      // Copy remaining elements from the right subarray
      while (idx2 <= ei) {
          merged[x++] = arr[idx2++];
      }

      // Copy merged array back to the original array
      for (int i = 0, j = si; i < merged.length; i++, j++) {
          arr[j] = merged[i];
      }
  }

  // Recursively divide the array
  public static void divide(int arr[], int si, int ei) {
      if (si >= ei) return; // Base case

      int mid = si + (ei - si) / 2;
      divide(arr, si, mid);   // Left half
      divide(arr, mid + 1, ei); // Right half
      conquer(arr, si, mid, ei); // Merge the sorted halves
  }

  public static void main(String[] args) {
      int[] arr = {6, 3, 9, 5, 2, 8};
      int n = arr.length;

      divide(arr, 0, n - 1);

      System.out.println("Sorted array:");
      for (int num : arr) {
          System.out.print(num + " ");
      }
  }
}
