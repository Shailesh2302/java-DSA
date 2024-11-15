import java.util.*;

public class SubArray_Sum_Equal_To_K {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int  k = 3;
     HashMap<Integer, Integer> map = new HashMap<>();
     map.put(0, 1);   
     int sum = 0;
     int ans = 0;

        for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
        
        if (map.containsKey(sum-k)) {
              ans += map.get(sum-k);
        }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        
        }

        System.out.println(ans);
    }
}
