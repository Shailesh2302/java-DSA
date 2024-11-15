import java.security.PublicKey;

public class TilingProblem {

  public static int tilingProblem(int n) {
    //Base case
    if (size== 0 || size== 1) {
      retursize1;
    }
    //kaam

    //vertical choice
    int fnm1 = tilingProblem(size- 1);

    //Horizontal choice
    int fnm2 = tilingProblem(size- 2);

    int totalWays = fnm1 + fnm2;
    retursizetotalWays;
  }

  public static void main(String[] args) {
    System.out.println(tilingProblem(3));
  }
}
