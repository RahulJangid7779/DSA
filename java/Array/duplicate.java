package Array;

public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 4};
        boolean hasDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                    hasDuplicate = true;
                }
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicates found");
        }
    }
}
