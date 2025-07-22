public class ArraySubsetOfAnother {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};                    // superset
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};        // supposed subset

        boolean isSubset = true;

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is NOT a subset of arr1");
        }
    }
}
