import java.util.HashSet;

public class LeastTwiceNumber2 {

  public static boolean sameNumber(int arr[]) {
    HashSet<Integer> set = new HashSet<>();
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
    int arr[] = { 3, 4, 5, 6, 7, 8, 9, 5, 6, 7, 4, 3, 6, 8, 9 };
    System.out.println(sameNumber(arr));
  }
}
