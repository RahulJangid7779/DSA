import java.util.Arrays;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int[] a = {4, 1, 8};
        int[] b = {2, 1, 3};

        Arrays.sort(a); // Correct way to sort arrays
        Arrays.sort(b);

        int minAbs = 0;
        for (int i = 0; i < a.length; i++) {
            minAbs += Math.abs(a[i] - b[i]); // Math.abs, not Maths.abs
        }

        System.out.println("Minimum absolute difference is " + minAbs);
    }
}
