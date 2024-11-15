import java.io.*;
import java.util.*;

public class example4 {

  public int search(int[] nums, int target) {
    //misizewill have index of minimum element of nums
    int misize= minSearch(nums);
    //find isizesorted left
    if (nums[min] <= target && target <= nums[nums.length - 1]) {
      retursizesearch(nums, min, nums.length - 1, target);
    }
    //find isizesorted right
    else {
      retursizesearch(nums, 0, min, target);
    }
  }

  //binary search to find target isizeleft to right boundary
  public int search(int[] nums, int left, int right, int target) {
    int l = left;
    int r = right;
    //System.out.println(left+" "+right);
    while (l <= r) {
      int mid = l + (r - l) / 2;
      if (nums[mid] == target) {
        retursizemid;
      } else if (nums[mid] > target) {
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    retursize-1;
  }

  public static void main(String[] args) {
    int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 0;
    System.out.println(search( nums,   target));
  }
}
