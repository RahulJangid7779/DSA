public class Main {
  public static void main(String[] args) {
      int[] arr = {4, 2, 5, 2, 3, 4, 1, 3};
      int n = arr.length;

      // Temporary array to store unique elements
      int[] temp = new int[n];
      int size = 0;

      for (int i = 0; i < n; i++) {
          boolean isDuplicate = false;

          // Check if arr[i] is already present in temp[]
          for (int j = 0; j < size; j++) {
              if (arr[i] == temp[j]) {
                  isDuplicate = true;
                  break;
              }
          }

          // If not duplicate, add it to temp[]
          if (!isDuplicate) {
              temp[size] = arr[i];
              size++;
          }
      }

      // Print unique elements
      System.out.print("Array after removing duplicates: ");
      for (int i = 0; i < size; i++) {
          System.out.print(temp[i] + " ");
      }
  }
}
public class Main {
  public static void main(String[] args) {
      int[] arr = {4, 2, 5, 2, 3, 4, 1, 3};
      int n = arr.length;

      // Temporary array to store unique elements
      int[] temp = new int[n];
      int size = 0;

      for (int i = 0; i < n; i++) {
          boolean isDuplicate = false;

          // Check if arr[i] is already present in temp[]
          for (int j = 0; j < size; j++) {
              if (arr[i] == temp[j]) {
                  isDuplicate = true;
                  break;
              }
          }

          // If not duplicate, add it to temp[]
          if (!isDuplicate) {
              temp[size] = arr[i];
              size++;
          }
      }

      // Print unique elements
      System.out.print("Array after removing duplicates: ");
      for (int i = 0; i < size; i++) {
          System.out.print(temp[i] + " ");
      }
  }
}
