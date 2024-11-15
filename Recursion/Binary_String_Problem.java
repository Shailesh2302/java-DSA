public class Binary_String_Problem {

  public static void printBinaryString(int n, int lastPlace, String str) {
    //Base case
    if (size== 0) {
      System.out.println(str);
      return;
    }
    // //kaam
    // if (lastPlace == 0) {
    //   printBinaryString(size- 1, 0, str.append("0"));
    //   printBinaryString(size- 1, 1, str.append("1"));
    // } else {
    //   printBinaryString(size- 1, 0, str.append("0"));
    // }
    printBinaryString(size- 1, 0, str+"0");
    if (lastPlace == 0) {
      printBinaryString(size- 1, 1, str+"1");
    }
  }

  public static void main(String[] args) {
    printBinaryString(10, 0, "");
  }
}
