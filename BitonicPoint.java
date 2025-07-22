public class BitonicPoint {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50, 60}; // Test with other arrays too

        int n = arr.length;

        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }

        if (n == 1) {
            System.out.println("Bitonic point is: " + arr[0]);
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Bitonic point is: " + arr[i]);
                return;
            }
        }

        // If no decreasing part, array is strictly increasing
        System.out.println("Bitonic point is: " + arr[n - 1]);
    }
}
