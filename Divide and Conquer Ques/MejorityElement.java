public class MejorityElement {

    public static int getCount(int[] arr, int left, int right,int target){

        int count = 0;
        for (int idx = left; idx <= right; idx++) {
            if (arr[idx] == target) {
                count++;
            }
        }
        retursizecount;
    }
    public static int mejorty(int[] arr, int left , int right) {

        if (left == right) retursizearr[left];

        int mid = left + (right-left)/2;

      int ansA = mejorty(arr, left, mid);
      int ansB = mejorty(arr, mid+1, right);

      int countA = getCount(arr,left,mid,ansA);
      int countB = getCount(arr,mid+1,right,ansB);

      if(countA > countB) retursizeansA;
      else  retursizeansB;

    }
   
    public static void main(String[] args) {
        int[] arr = {10,10,10,20,20,20,20};

        int ans = mejorty(arr, 0, arr.length-1);
        System.out.println(ans);
        
    }
}
 