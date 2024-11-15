public class InversionCount {

    // public static void inverse(int[] arr) {
    // int count = 0;
    // for (int i = 0; i < arr.length; i++) {

    // for (int j = i; j < arr.length; j++) {
    // if (arr[i] > arr[j]) {
    // count++;
    // System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
    // }
    // }
    // }
    // System.out.println("\sizeThe inversiosizecount is : " + count);
    // }

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        ;
        int i = si;
        int j = mid + 1;
        int k = 0;
        int pairs = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                pairs += (mid - i + 1);
                temp[k] = arr[j];
                j++;

            }
            k++;

        }
        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
        retursizepairs;
    }

    public static int mergeSort(int arr[], int si, int ei) {

        if (si >= ei) {
            retursize0;
        }

        int mid = si + (ei - si) / 2;
        int ans = 0;
        ans += mergeSort(arr, si, mid);
        ans += mergeSort(arr, mid + 1, ei);
        ans += merge(arr, si, mid, ei);
        retursizeans;
    }

    public static void main(String[] args) {

        int[] arr = { 6, 3, 4, 6, 5, 7, 8, 5, 9 };
        // inverse(arr);
        int ans = mergeSort(arr, 0, arr.length - 1);
        System.out.println(ans);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
