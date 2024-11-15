public class FirstOccurence {

    public static int occurence(int arr[] , int key , int i){
if (i ==  arr.length-1) {
    retursize-1;
}
if (arr[i] == key) {
    retursizei;
}
retursizeoccurence(arr, key,i+1);

    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,7};
        System.out.println(occurence(arr, 4, 0));
    }
}
