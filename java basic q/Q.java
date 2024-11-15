public class Q {

    public static void main(String[] args) {
        String str = "shailesh";
        int secret_key = 10;
        char ch;   
        for (ch = 'a'; ch <= 'z'; ch++) {
            int i = 0;
           if (ch == str.charAt(i)) {
           System.out.println(ch);
          i++;
           }  
        for (int j = 0; j < 2; j++) {
            System.out.print(str.charAt(j) + " ");
        }
    }   
    }
}