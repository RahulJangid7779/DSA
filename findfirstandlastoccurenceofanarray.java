public class findfirstandlasr {
  // Function to find the first occurrence using Binary Search
  public static int findFirst(int arr[], int target) {
      int start = 0, end = arr.length - 1, first = -1;
      while (start <= end) {
          int mid = start + (end - start) / 2;
          if (arr[mid] == target) {
              first = mid;
              end = mid - 1;  // Search on the left side
          } else if (arr[mid] < target) {
              start = mid + 1;
          } else {
              end = mid - 1;
          }
      }
      return first;
  }

  // Function to find the last occurrence using Binary Search
  public static int findLast(int arr[], int target) {
      int start = 0, end = arr.length - 1, last = -1;
      while (start <= end) {
          int mid = start + (end - start) / 2;
          if (arr[mid] == target) {
              last = mid;
              start = mid + 1;  // Search on the right side
          } else if (arr[mid] < target) {
              start = mid + 1;
          } else {
              end = mid - 1;
          }
      }
      return last;
  }

  // Main function
  public static void main(String[] args) {
      int arr[] = {2, 4, 4, 4, 7, 8, 9};
      int target = 4;

      int first = findFirst(arr, target);
      int last = findLast(arr, target);

      System.out.println("First occurrence: " + first);
      System.out.println("Last occurrence: " + last);
  }
}
