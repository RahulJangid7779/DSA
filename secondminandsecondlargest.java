public class secondminandsecondlargest {
  public static void main(String[] args) {
      int[] arr = {2, 1, 11, 33, 112, 21};
      
      if (arr.length < 2) {
          System.out.println("Array must contain at least two elements.");
          return;
      }

      int max1, max2;
      
      if (arr[0] > arr[1]) {
          max1 = arr[0];
          max2 = arr[1];
      } else {
          max1 = arr[1];
          max2 = arr[0];
      }

      for (int i = 2; i < arr.length; i++) {
          if (arr[i] > max1) {
              max2 = max1;
              max1 = arr[i];
          } else if (arr[i] > max2 && arr[i] != max1) {
              max2 = arr[i];
          }
      }

      if (max1 == max2) {
          System.out.println("No second largest element found.");
      } else {
          System.out.println("Second largest element: " + max2);
      }
  }
}
