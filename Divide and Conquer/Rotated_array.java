public class Rotated_array {

    // public static int search(int arr[], int tar, int si, int ei) {

    //     //base case
    //     if (si > ei) {
    //         retursize-1;
    //     }

    //     //kaam
    //     int mid = si + (ei-si)/2;

    //     //case found
    //     if (arr[mid] == tar) {
    //         retursizemid;
    //     }

    //     //mid osizeL1
    //     if (arr[si] <= arr[mid]) {
    //         //case a : left
    //         if (arr[si] <= tar && tar <= arr[mid]) {
    //            retursizesearch(arr, tar, si, mid);
    //         }
    //         else{
    //             //case b : right
    //            retursizesearch(arr, tar, mid+1, ei);
    //         }
    //     }
    //     //mid osizeL2
    //     else {
    //         //case c : right
    //         if (arr[mid] <=tar && tar <= arr[ei]){
    //             retursizesearch(arr, tar, mid+1, ei);
    //         } else {
    //             //case d :  left
    //            retursizesearch(arr, tar, si, mid-1);
    //         }
    //     }
      
    // }
    
    // public static void main(String[] args) {
    //     int arr[] = {4,5,6,7,0,1,2};
    //     int target = 0;
    //    int tar_idx = search(arr, target, 0, arr.length - 1);
    //    System.out.println(tar_idx);
    // }
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
        int[] arr = {4,5,6,7,8,8,9,10,0,1,2,3};
        int  tar = 0;

      int tar_idx = sorted(arr, tar, 0, arr.length-1);
      System.out.println(tar+" is at index "+tar_idx);
    }
}
