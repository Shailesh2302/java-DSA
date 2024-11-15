import java.util.*;

public class TrappedWater {

  public static int trappedwater(int heigth[]) {
    //left max boundary
    int leftmax[] = new int[heigth.length];
    leftmax[0] = heigth[0];
    for (int i = 1; i < heigth.length; i++) {
      leftmax[i] = Math.max(leftmax[i - 1], heigth[i]);
    }
    //right max boundary
    int rightmax[] = new int[heigth.length];
    rightmax[heigth.length - 1] = heigth[heigth.length - 1];

    for (int i = heigth.length - 2; i >= 0; i--) {
      rightmax[i] = Math.max(rightmax[i + 1], heigth[i]);
    }
    
    //water level
    int trappedwater = 0;

    for (int i = 0; i < heigth.length; i++) {
      int waterlevel = Math.min(rightmax[i], leftmax[i]);

      //trapped water
      trappedwater += waterlevel - heigth[i];
    }
    return trappedwater;
  }

  public static void main(String[] args) {
    int heigth[] = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println(trappedwater(heigth));
  }
}
