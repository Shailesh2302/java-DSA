import java.util.HashSet;
import javax.print.attribute.HashAttributeSet;

public class LeastTwiceNumber3 {

  public static boolean sameNumber(String arr[]) {
    HashSet<String> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      if (set.contains(arr[i])) {
        return true;
      } else {
        set.add(arr[i]);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String arr[] = { "rahul", "ram", "shyam", "gopal", "radha","ram" };
    System.out.println(sameNumber(arr));
  }
}
