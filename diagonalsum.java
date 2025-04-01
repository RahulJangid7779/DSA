public class diagonalsum {
  public static void main(String[] args) {
    int matrix[][] = {
      {1,  2,  3,  4},
      {5,  6,  7,  8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}
    };
    
    int sum = 0;
    
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];  // Primary diagonal
      if (i != matrix.length - 1 - i) {  // Avoid double counting
        sum += matrix[i][matrix.length - 1 - i];  // Secondary diagonal
      }
    }
    
    System.out.print("Diagonal Sum: " + sum);
  }
}
