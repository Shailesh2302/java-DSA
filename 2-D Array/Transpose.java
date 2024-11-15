public class Transpose {

  public static void main(String[] args) {
    int[][] matrix = { { 2, 3, 4 }, { 5, 6, 7 } };

    int n = 2, m = 3;
    System.out.println("the old matrix is :");

    int[][] transeverse = new int[m][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        transeverse[j][i] = matrix[i][j];
      }
    }
    for (int i = 0; i < transeverse.length; i++) {
      for (int j = 0; j < transeverse[0].length; j++) {
        System.out.print(transeverse[i][j] + " ");
      }
      System.out.println();
    }
    //print(transeverse);
  }
  // public static void print(int[][] matrix) {
  //   System.out.println("the new matrix is : ");
  //   for (int i = 0; i < matrix.length; i++) {
  //     for (int j = 0; j < matrix[0].length; j++) {
  //       System.out.print(matrix[i][j] + " ");
  //     }
  //     System.out.println();
  //   }
}
