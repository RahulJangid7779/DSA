public class ThirdLargestElement {
  public static void main(String[] args) {
      int[] arr = {2, 1, 11, 33, 112, 21};

      int max1 = Integer.MIN_VALUE;
      int max2 = Integer.MIN_VALUE;
      int max3 = Integer.MIN_VALUE;

      for (int num : arr) {
          if (num > max1) {
              max3 = max2;
              max2 = max1;
              max1 = num;
          } else if (num > max2 && num != max1) {
              max3 = max2;
              max2 = num;
          } else if (num > max3 && num != max1 && num != max2) { // ✅ Fixed Condition
              max3 = num;
          }
      }

      if (max3 == Integer.MIN_VALUE) {
          System.out.println("No third largest element found.");
      } else {
          System.out.println("Third largest element: " + max3);
      }
  }
}
