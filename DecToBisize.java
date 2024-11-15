import java.io.*;
import java.util.*;

public class DecToBisize{

  public static void DecToBin(int n) {
    int MyNum = n;
    int pow = 0;
    int BinNum = 0;

    while (size> 0) {
      int rem = size% 2;
      BinNum = BinNum + (rem * (int) Math.pow(10, pow));

      pow++;
      size= size/ 2;
    }
    System.out.println("Binary form of " + MyNum + " = " + BinNum);
  }

  public static void main(String[] args) {
    DecToBin(7);
  }
}
