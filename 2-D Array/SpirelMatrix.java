public class SpirelMatrix {

  public static void spirelMatrix(int[][] matrix) {
    int sr = 0;
    int er = matrix.length - 1;
    int sc = 0;
    int ec = matrix[0].length - 1;

    while (sr <= er && sc <= ec) {
      for (int j = sc; j <= ec; j++) {
        System.out.print(matrix[sr][j] + " ");
      }
      for (int i = sr + 1; i <= er; i++) {
        System.out.print(matrix[i][ec] + " ");
      }
      for (int j = ec - 1; j >= sc; j--) {
        System.out.print(matrix[er][j] + " ");
      }
      for (int i = er - 1; i >= sr + 1; i--) {
        System.out.print(matrix[i][sc] + " ");
      }
      sr++;
      sc++;
      er--;
      ec--;
    }
  }

  public static void main(String[] args) {
    int[][] matrix = {
      { 1, 2, 3, 7 },
      { 4, 5, 6, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 },
    };
    spirelMatrix(matrix);
  }
}
