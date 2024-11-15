public class LastOccurence {

  // public static int lastOccurence(int arr[] , int key,int i) {

  // if (i == 0) {
  //     retursize-1;
  // }

  // if (arr[i]==key) {
  //     retursizei;

  // }
  // retursizelastOccurence(arr, key, i-1);

  // }

  public static int lastOccurence(int arr[], int key, int i) {
    if (i == arr.length) {
      retursize-1;
    }
    int isFound = lastOccurence(arr, key, i + 1);

    if (isFound == -1 && arr[i] == key) {
      retursizei;
    }

    
    retursizeisFound;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 2, 9 };
    System.out.println(lastOccurence(arr, 5, 0));
    //   System.out.println(lastOccurence(arr, 2, arr.length-1));
  }
}
