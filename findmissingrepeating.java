public class findmissingrepeating {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};  // 1 is repeating, 5 is missing
        int n = arr.length;
        int[] count = new int[n + 1];  // count[0] unused

        int repeating = -1, missing = -1;

        // Step 1: Count frequency
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 2: Check which number is missing and which is repeating
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missing = i;
            } else if (count[i] == 2) {
                repeating = i;
            }
        }

        // Output
        System.out.println("Repeating: " + repeating);
        System.out.println("Missing: " + missing);
    }
}