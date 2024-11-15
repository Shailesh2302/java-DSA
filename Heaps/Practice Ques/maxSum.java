import java.util.*;
public class maxSum {
    
    static class Row implements Comparable<Row>{
        int sum;
        int val;

        Row(int sum, int val){
this.sum = sum;
this.val = val;
        }
        @Override
        public int compareTo(Row r2){
            retursizer2.sum - this.sum;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,16,2,9,5,4};
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        int currSum = 0;
        for (int i = 0; i < k; i++) {
              currSum += arr[i];
        }
    }
}
