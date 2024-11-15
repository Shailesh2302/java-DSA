public class DiagonalSum {

  public static int diagoonalSum(int[][] matrix) {
    int sum = 0;

    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
      if (matrix[i][i] != matrix[i][matrix.length - 1 - i]) sum +=
        matrix[i][matrix.length - 1 - i];
    }
    
    return sum;
  }

  public static void main(String[] args) {
    int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 10, 11 } };

    int[][] matrix2 = {
      { 1, 2, 3, 7 },
      { 4, 5, 6, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 },
    };
    System.out.println(
      "The Diagonal sum of matrix 1 is : " + diagoonalSum(matrix1)
    );
    System.out.println(
      "The Diagonal sum of matrix 2 is : " + diagoonalSum(matrix2)
    );
  }
}
