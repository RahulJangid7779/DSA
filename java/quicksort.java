public class quicksort {
  // Partition function to rearrange elements around the pivot
  public static int partition(int arr[], int low, int high) {
      int pivot = arr[high];  // Choosing last element as pivot
      int i = low - 1;  // Pointer for smaller element

      for (int j = low; j < high; j++) {
          if (arr[j] < pivot) {  // If current element is smaller than pivot
              i++;
              // Swap arr[i] and arr[j]
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
          }
      }

      // Swap pivot with the element at i+1
      int temp = arr[i + 1];
      arr[i + 1] = arr[high];
      arr[high] = temp;

      return i + 1;  // Returning pivot index
  }

  // QuickSort function
  public static void quickSort(int arr[], int low, int high) {
      if (low < high) {
          int pi = partition(arr, low, high);  // Get pivot index

          // Recursively apply QuickSort to left and right subarrays
          quickSort(arr, low, pi - 1);
          quickSort(arr, pi + 1, high);
      }
  }

  public static void main(String[] args) {
      int[] arr = {6, 3, 9, 5, 2, 8};
      int n = arr.length;

      quickSort(arr, 0, n - 1);

      System.out.println("Sorted array:");
      for (int num : arr) {
          System.out.print(num + " ");
      }
  }
}
