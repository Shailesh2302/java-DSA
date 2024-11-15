public class MergeSort {

    public static booleasizesmaller(String a, String b) {
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            
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
    

    public static void  mergeArray(String arr[], int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right-left)/2;

        mergeArray(arr, left, mid);
        mergeArray(arr, mid+1, right);
        merge(arr, left, mid, right);
    }
    public static void merge(String[] arr, int left, int mid, int right ) {
        String[] temp = new String[right-left+1];
        
        int i = left;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (smaller(arr[i], arr[j]) == true) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
            
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i=left, k = 0; k < temp.length;i++, k++) {
            arr[i] = temp[k];
        }
    }
    public static void print(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        String[] arr = {"q" , "mars" , "mark" , "marker" , "a" , "c"};
        
        mergeArray(arr, 0, arr.length-1);
        print(arr);
    }
}
