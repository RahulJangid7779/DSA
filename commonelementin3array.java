import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        List<Integer> result = findCommonElements(arr1, arr2, arr3);

        System.out.println("Common elements: " + result);
    }

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        List<Integer> common = new ArrayList<>();

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            // If x == y and y == z, it's common
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                common.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            // Move the pointer which has the smallest value
            else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        return common;
    }
}
