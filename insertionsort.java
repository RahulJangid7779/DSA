public class InsertionSort {
  public static void insertionSort(int arr[]) {
    int n = arr.length;
    
    for (int i = 1; i < n; i++) {   // Start from the second element
      int key = arr[i];             // The element to be placed correctly
      int j = i - 1;                // Start comparing with the previous element
      
      // Shift elements to the right to create space for key
      while (j >= 0 && arr[j] > key) {  
        arr[j + 1] = arr[j];
        j--;
      }
      
      arr[j + 1] = key;  // Insert key at the correct position
    }
  }

  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 6, 2};
    
    System.out.print("Original Array: ");
    for (int num : arr) System.out.print(num + " ");
    
    insertionSort(arr);

    System.out.print("\nSorted Array: ");
    for (int num : arr) System.out.print(num + " ");
  }
}
