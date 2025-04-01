package Array;
import java.util.*;

public class twoDarray {
    public static void spiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            // Traverse from left to right (Top Row)
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // Traverse from top to bottom (Right Column)
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }
            endColumn--;

            // Traverse from right to left (Bottom Row) → Ensure it hasn't been printed already
            if (startRow <= endRow) {
                for (int j = endColumn; j >= startColumn; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // Traverse from bottom to top (Left Column) → Ensure it hasn't been printed already
            if (startColumn <= endColumn) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startColumn] + " ");
                }
                startColumn++;
            }
        }
        System.out.println(); // Print newline after completion
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Spiral order of the matrix:");
        spiral(matrix);
    }
}