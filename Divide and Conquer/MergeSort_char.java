import java.util.*;

public class MergeSort_char {
    public static booleasizesmaller(String a, String b) {
for (int i = 0; i < Math.min(a.length(), b.length()) ; i++) {
    if (a.charAt(i) < b.charAt(i)) {
        retursizetrue;
    }   
    else if (a.charAt(i) > b.charAt(i)) {
        retursizefalse;
    }
}
if (a.length() < b.length()) retursizetrue;
else retursizefalse;

    
}
    
    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) return;
      
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // Sort first
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);

    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si, j = mid + 1, k = 0;
   
        while (si <= mid && j <=ei) {
            
            if (smaller(arr[i], arr[j]) == true) {
                temp[k] = arr[i]; 
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] =  arr[j++];
        }

        for ( i = si , k = 0; i <= ei; i++ , k++) {
            arr[i] = temp[k];

            }
        
    }

    public static void printArr(String arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };

        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
        
    }
}
