package Array;
public class MinMaxArray {
    public static void main(String[] args) {
      int[] arr = {1, 4, 5, 3, 2};
      
      int min = arr[0]; // Assume first element is min
      int max = arr[0]; // Assume first element is max
  
      for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
          min = arr[i]; // Update min
        }
        if (arr[i] > max) {
          max = arr[i]; // Update max
        }
      }
  
      System.out.println("Minimum value: " + min);
      System.out.println("Maximum value: " + max);
    }
  }
  