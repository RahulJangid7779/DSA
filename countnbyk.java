public class countnbyk {
  public static void main(String args[]) {
    int arr[] = {2, 2, 2, 2, 4, 4, 4, 3, 3};
    int n = arr.length;
    int k = 2;

    int max = Integer.MIN_VALUE;

    // Find the maximum value in arr
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    int count[] = new int[max + 1]; // to store frequency of each element

    for (int i = 0; i < n; i++) {
      count[arr[i]]++;
    }

    int threshold = n / k;

    System.out.println("Elements occurring more than n/k times:");
    for (int i = 0; i <= max; i++) {
      if (count[i] > threshold) {
        System.out.println(i + " => " + count[i] + " times");
      }
    }
  }
}
