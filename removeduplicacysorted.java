import java.util.Arrays;

public class removeduplicacysorted {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int i = 0;  // slow pointer

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];  // overwrite duplicate
            }
        }

        return i + 1;  // length of unique part
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
