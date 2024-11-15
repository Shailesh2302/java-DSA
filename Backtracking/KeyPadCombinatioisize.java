public class KeyPadCombinatioisize{
    final static char[][] keypad = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
            { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void combination(String digits, StringBuilder ans, int index, int len) {
        if (index == len) {
            System.out.println(ans.toString());
            return;
        }

        char[] keyPos = keypad[Character.getNumericValue(digits.charAt(index))];

        for (int i = 0; i < keyPos.length; i++) {
            combination(digits, new StringBuilder(ans).append(keyPos[i]), index + 1, len);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        int lesize= digits.length();
        combination(digits, new StringBuilder(""), 0, len);
    }
}
