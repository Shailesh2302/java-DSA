import java.util.*;

public class InputMatrix {

  public static boolean serach(int[][] matrix, int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("key is at : (" + i + "," + j + ")");
          return true;
        }
      }
    }
    System.out.println("key is not there");
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matrix = new int[3][3];
    int n = matrix.length, m = matrix[0].length;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    serach(matrix, 7);
  }
}
