public class palindrome2 {
    public static boolean Palindeome(String str) {

        int n = str.length()-1;
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(n-i)) {
                return  false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) {
        String str = "racecar";
System.out.println(Palindeome(str));
}
}