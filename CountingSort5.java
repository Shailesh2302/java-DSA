public class CountingSort5 {

public static void countingSort5(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        largest = Math.max(largest, arr[i]);
    }
    int count[] = new int[largest +1];
    for (int i = 0; i < count.length; i++) {
        count[arr[i]]++;
    }
    int j=0;
    for (int i = 0; i < count.length; i++) {
        while (count[i] > 0) {
            arr[j] =i;
            j++;
            count[i]--;
        }
    }
}
public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
    public static void main(String[] args) {
        int arr[] ={4,5,6,3,2,1,9,8,7,6,1,5,3,8,6,3,8,0,1};
        countingSort5(arr);
        printArray(arr);
    }
}
