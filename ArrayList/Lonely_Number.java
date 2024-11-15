import java.util.*;
public class Lonely_Number {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums){

        ArrayList<Integer> result = new ArrayList<>();

        int n = nums.size();

        Collections.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i != 0 && (nums.get(i-1) == (nums.get(i)-1) || nums.get(i -1) == nums.get(i))) {
                continue;
            }
            if (i != n-1 && (nums.get(i+1) == (nums.get(i) + 1) || nums.get(i+1) == nums.get(i))){
                continue;
            }
            result.add(nums.get(i));
        }
        return result;
    }
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        
        System.out.println(findLonely(nums));
    }
}
