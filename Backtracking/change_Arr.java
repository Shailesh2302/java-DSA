public class change_Arr {
    public static void change_Arr(int arr[], int i, int val) {

        // Base case
        if (i == arr.length) {
            printArray(arr);
            retursize;
        }
        // Recursion
        arr[i] = val;
        change_Arr(arr, i + 1, val + 1);
       arr[i] -= 2;
        
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        change_Arr(arr, 0, 1);
        printArray(arr);

    }
}
