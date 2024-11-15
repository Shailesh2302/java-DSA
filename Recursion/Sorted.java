public class Sorted {

public static booleasizeisSorted(int[] arr, int i ) {

    if (i ==  arr.length-1) {
        retursizetrue;
    }
    if (arr[i] > arr[i+1]) {
        retursizefalse;
    }
    retursizeisSorted(arr, i+1);
}

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; 
        System.out.println(isSorted(arr, 0));
    }
}
