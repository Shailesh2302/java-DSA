public class TransposeOfMatrix {

  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

    int row = matrix.length;
    int col = matrix[0].length;

printMatrix(matrix);

    int Transpose[][] = new int[col][row];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        Transpose[j][i] = matrix[i][j];
      }
    }
    printMatrix(Transpose);
  }

  public static void printMatrix(int matrix[][]) {
    System.out.println("The matrix is :");

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
