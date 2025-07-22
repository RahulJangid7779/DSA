public class firstandlastoccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 6, 7};
        int x = 4;
        int first = -1;
        int last = -1;

        // Find first occurrence
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                first = i;
                break;
            }
        }

        // Find last occurrence
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                last = i;
                break;
            }
        }

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
