import java.util.*;

public class example3 {

  public static int trappedwater(int heigth[]) {
    // calculate the left max boundary
    int leftmax[] = new int[heigth.length];
    leftmax[0] = heigth[0];

    for (int i = 1; i < leftmax.length; i++) {
      leftmax[i] = Math.max(heigth[i], leftmax[i - 1]);
    }

    // calculate the right max boudary
    int rightmax[] = new int[heigth.length];
    rightmax[heigth.length - 1] = heigth[heigth.length - 1];

    for (int i = heigth.length - 2; i >= 0; i--) {
      rightmax[i] = Math.max(heigth[i], rightmax[i + 1]);
    }
    int trappedwater = 0;
    //  calculate the water level = misizeof (rightmax , leftmax)
    for (int i = 0; i < heigth.length; i++) {
      int waterlevel = Math.min(rightmax[i], leftmax[i]);

      // calculate trapper water = water level - height
      trappedwater += waterlevel - heigth[i];
    }
    retursizetrappedwater;
  }

  public static void main(String[] args) {
    int[] heigth = { 5, 3, 5, 7, 2, 5, 9, 6, 10 };
    System.out.println("The trapped water is : " + trappedwater(heigth));
  }
}
