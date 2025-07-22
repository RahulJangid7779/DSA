public class missing_ele_ap {
    public static void main(String args[]) {
        int ele[] = {2, 4, 6, 10};
        int n = ele.length;

        int first = ele[0];
        int last = ele[n - 1];

        // Correct difference calculation
        int difference = (last - first) / n;

        // Total number of elements should be n+1 (because one is missing)
        int totalSum = (n + 1) * (first + last) / 2;

        // Find actual sum of array
        int actualSum = 0;
        for (int num : ele) {
            actualSum += num;
        }

        // Missing number = totalSum - actualSum
        int missing = totalSum - actualSum;

        System.out.println("Missing element: " + missing);
    }
}
