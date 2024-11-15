import java.util.HashSet;

public class LeastTwiceNumber {

  public static boolean truefalsestatament(int nums[]) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j <= nums.length; j++) {
        if (nums[i] == nums[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean containDuplicate(int nums[]) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) {
        return true;
      } else {
        set.add(nums[i]);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 6, 5, 4, 4, 3, 4, 5, 1 };
    System.out.println(truefalsestatament(nums));
    System.out.println(containDuplicate(nums));
  }
}
