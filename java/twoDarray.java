package Array;
import java.util.*;

public class twoDarray {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        // Taking input for the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing the 2D array using Arrays.deepToString
        System.out.println(Arrays.deepToString(matrix));
    }
}
