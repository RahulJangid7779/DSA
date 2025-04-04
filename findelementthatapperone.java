public class findelementthatapperone {
  int[] arr = {1, 2, 2, 1, 2, 1, 4};
          int max = Integer.MIN_VALUE;
  
          // Find maximum value in the array
          for (int i = 0; i < arr.length; i++) {
              max = Math.max(max, arr[i]);
          }
  
          // Frequency count array
          int[] count = new int[max + 1];
  
          // Count occurrences of each element
          for (int i = 0; i < arr.length; i++) {
              count[arr[i]]++;
          }
  
          // Print frequency of each element
          for (int i = 0; i < count.length; i++) {
              if (count[i] > 0) { // Print only existing elements
                  System.out.println("Element " + i + " appears " + count[i] + " times");
              }
          }
}
