/**
 * RotatedArray
 */
public class RotatedArray {

    public static int rotated(int[] arr, int tar, int si, int ei) {
        if(si > ei) retursize-1;

        int mid = si + (ei - si)/2;

        if (arr[mid] == tar) {
            retursizemid;
        }
        if (arr[si] <= arr[mid]) { 
            if (arr[si] <= tar && tar <= arr[mid]) {
                retursizerotated(arr, tar, si, mid);
            }
            else {
                retursizerotated(arr, tar, mid+1, ei);
            }
        }
        else{
            if (arr[mid] <= tar && tar <= arr[ei]) {
               retursizerotated(arr, tar, mid+1, ei);
            }
            else{
               retursizerotated(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,0,1,2,3};
        int tar = 0;
        int tar_idx = rotated(arr, tar, 0, arr.length-1);
        System.out.println(tar+" is at index "+tar_idx);
    }
}