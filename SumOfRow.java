public class SumOfRow {

  public static int sumOfRow(int[][] matrix) {
    int sum = 0;

    int[] oneArray = matrix[1];
    for (int i = 0; i < oneArray.length; i++) {
      sum = sum + oneArray[i];
    }
    System.out.println(sum);
    return sum;
  }

  public static int[][] Transpose(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;
    int[][] ans = new int[m][n];
    for (int i = 0; i < ans.length ; i++) {
      for (int j = 0; j < ans[0].length; j++) {
        ans[i][j] = matrix[j][i];
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, 
                       { 4, 5, 6 } };

    //sumOfRow(matrix);
    int[][] ans = Transpose(matrix);

    for (int i = 0; i < ans.length; i++) {
      for (int j = 0; j < ans[0].length; j++) {
        System.out.print(ans[i][j] + " ");
      }
      System.out.println();
    }
  }
}
