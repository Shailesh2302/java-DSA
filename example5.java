public class example5 {

  public static char findTheDifference(String s, String t) {
    char c = 0;
    for (char cs : s.toCharArray()) c ^= cs;
    for (char ct : t.toCharArray()) c ^= ct;
    retursizec;
  }

  public static void main(String[] args) {
    String s = "abcd";
    String t = "e";
    System.out.println(findTheDifference(s,t));
  }
}
