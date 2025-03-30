
public class moveallzerotoend {
    public static void main(String args[]) {
        int[] arr = {0, 2, 1, 0, 23, 11, 0};

        int j = 0; // Pointer to place non-zero elements

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++; // Increment non-zero position
            }
        }

        System.out.println(Arrays.toString(arr)); // Print the modified array
    }
}
