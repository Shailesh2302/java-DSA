public class Permutationa_Of_String {

    public static void permutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i + 1);

            permutation(newStr, ans + currChar);

        }

    }

    public static void main(String[] args) {
        String str = "abc";
        // permutation(str, "");
        combination(str, "");

    }

    public static void combination(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i + 1);
            // System.out.println(str.length());
            combination(newStr, ans + currChar);
        }
    }
}
