import java.io.*;
import java.util.*;

public class BinaryToDecimal {

  public static void BintoDec(int BinNum) {
    int MyNum = BinNum;
    int pow = 0;

    int decNum = 0;

    while (BinNum > 0) {
      int LastDigit = BinNum % 10;

      decNum = decNum + (LastDigit * (int) Math.pow(2, pow));

      pow++;
      BinNum = BinNum / 10;
    }
    System.out.println("Decimal of " + MyNum + " = " + decNum);
  }

  public static void main(String[] args) {
    BintoDec(101111);
  }
}
