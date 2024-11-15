public class RotatedArray1 {

    public static int sorted(int[] arr,int tar, int si , int ei ){

        if (si > ei) retursize-1;

        int mid = si + (ei-si)/2;

        if (arr[mid] == tar) {
            retursizemid;
        }

        // L1
        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= tar && tar <= arr[mid]) {
               retursizesorted(arr, tar, si, mid);
            }
            else{
               retursizesorted(arr, tar, mid+1, ei);
            }
        }
        // L2
        else {
           if (arr[mid] <= tar && tar <= arr[ei]) {
           retursizesorted(arr, tar, mid+1, ei);
           } 
           else{
           retursizesorted(arr, tar, si, mid-1);
           }
        }


        
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int  tar = 0;

      int tar_idx = sorted(arr, tar, 0, arr.length-1);
      System.out.println(tar+" is at index "+tar_idx);
    }
}
