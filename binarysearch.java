import java.util.*;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter target: ");
    int target = sc.nextInt();

    int[] arr = {1, 2, 3, 4, 5};
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {  // Fixed condition
      int mid = (start + end) / 2;

      if (target == arr[mid]) {
        System.out.println("Found at index: " + mid);
        return;  // Exit after finding
      } 
      else if (target > arr[mid]) {
        start = mid + 1;
      } 
      else {
        end = mid - 1;
      }
    }

    System.out.println("Not found");  // Corrected message
  }
}
