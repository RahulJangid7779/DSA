public class findcountzero {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0};
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        count++;
      }
    }

    System.out.println("Number of zeroes: " + count);
  }
}
