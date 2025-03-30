public class findfirstandlastoccurenceofunsortedarray {
  public static void findOccurrences(int[] arr, int target) {
      int firstIndex = -1, secondIndex = -1, lastIndex = -1;

      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == target) {
              if (firstIndex == -1) {
                  firstIndex = i; // First occurrence
              } else if (secondIndex == -1) {
                  secondIndex = i; // Second occurrence
              }
              lastIndex = i; // Keep updating last occurrence
          }
      }

      System.out.println("First Occurrence: " + firstIndex);
      System.out.println("Second Occurrence: " + (secondIndex != -1 ? secondIndex : "Not Found"));
      System.out.println("Last Occurrence: " + lastIndex);
  }

  public static void main(String[] args) {
      int[] arr = {4, 2, 3, 2, 5, 2, 7, 2, 9}; // Example array
      int target = 2;
      findOccurrences(arr, target);
  }
}
