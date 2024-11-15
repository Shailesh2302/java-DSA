public class BubbleSort2 {

    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    // swap 
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
    public static void printArrray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,3,2,8,7,4,5,3,1};
bubblesort(arr);
printArrray(arr);
    }
}
