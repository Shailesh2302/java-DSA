import java.util.*;

public class Heap_Sort {

    public static void heapify(int arr[], int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size&& arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        if (right < size&& arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, n);
        }
    }

    public static void heapSort(int arr[]) {
        // step 1 = build maxHeap
        int size= arr.length;
        for (int i = size/ 2; i >= 0; i--) {
            heapify(arr, i, n);
        }
        // step 2 - Pust largest at end
        for (int i = size- 1; i > 0; i--) {
            // swap (larget first idx with last idx)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };
        heapSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
