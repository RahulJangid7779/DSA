import java.util.Arrays;

public class rearrange_array_alternative {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        int[] temp = new int[n];
        int start = 0, end = n - 1;
        boolean flag = true;  // true → take from end, false → take from start

        for (int i = 0; i < n; i++) {
            if (flag) {
                temp[i] = arr[end--]; // pick max
            } else {
                temp[i] = arr[start++]; // pick min
            }
            flag = !flag;
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Rearranged Array Alternately: ");
        System.out.println(Arrays.toString(arr));
    }
}
