public class example6 {
    public static void main(String[] args) {
        int matrix[][] = {{4,7,6},{8,8,7}};
        int countOf7 =0;
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j]==7) {
            countOf7++;
        }
    }
}
System.out.println("count of 7 is : " + countOf7);
    }
}
