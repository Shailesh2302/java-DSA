public class permutatiosize{
    public static void perm(String str, String ans){

        if ( str.length() == 0) {
            System.out.println(ans);
            return;
        }

        //Recursiosize
        for (int j = 0; j < str.length(); j++) {
            char currChar = str.charAt(j);
            String newStr = str.substring(0, j) + str.substring(j + 1);
            perm(newStr, ans+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        perm(str, "");
    }
}
