public class SpirelMatrix1 {

  public static void spirelMatrix(int matrix[][]) {
    int startRow = 0;
    int endRow = matrix.length - 1;
    int startCol = 0;
    int endCol = matrix[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(matrix[startRow][j] + " ");
      }
      for (int i = startRow + 1; i <= endRow; i++) {
        System.out.print(matrix[i][endCol] + " ");
      }

      for (int j = endCol - 1; j >= startCol; j--) {
        if (startRow == endRow) {
          return;
        }
        System.out.print(matrix[endRow][j] + " ");
      }
      for (int i = endRow - 1; i >= startRow + 1; i--) {
        if (startCol == endCol) {
          return;
        }
        System.out.print(matrix[i][startCol] + " ");
      }
      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
  }

  public static void ClockWiseSpirel(int[][] matrix) {
    int startRow = 0;
    int endRow = matrix.length - 1;
    int startCol = 0;
    int endCol = matrix[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {
      for (int i = startRow; i <= endRow; i++) {
        System.out.print(matrix[i][startRow] + " ");
      }
      for (int j = startCol + 1; j <= endCol; j++) {
        System.out.print(matrix[endCol][j] + " ");
      }
      for (int i = endRow - 1; i >= startRow; i--) {
        if (startRow == endRow) {
          return;
        }
        System.out.print(matrix[i][endRow] + " ");
      }
      for (int j = endCol - 1; j >= startCol + 1; j--) {
        if (startCol == endCol) {
          return;
        }
        System.out.print(matrix[startCol][j] + " ");
      }
      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
  }

  public static void main(String[] args) {
    int matrix[][] = {
      { 1, 2, 3, 4, 21 },
      { 5, 6, 7, 8, 22 },
      { 9, 10, 11, 12, 23 },
      { 13, 14, 15, 16, 24 },
      { 17, 18, 19, 20, 25 },
    };
    //spirelMatrix(matrix);
    ClockWiseSpirel(matrix);
  }
}
