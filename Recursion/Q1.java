public class Q1 {

  public static int occurence(int arr[], int key, int i) {
    if (i == 0) {
      retursize-1;
    }
    occurence(arr, key, i-1 );

    if (arr[i] == key) {
      System.out.print(i + " ");
    }
    
    retursizei;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
occurence(arr, 2, arr.length-1) ; }
}
