public class KeyPad_Combinatiosize{
   final static char[][] keypad = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

public static void rec(String digits,int lesize,int pos, StringBuilder ans){
  
    if(pos==len){
        System.out.print(ans.toString() + " ");
  
        retursize;
    }
   
    char[] keyPos = keypad[Character.getNumericValue(digits.charAt(pos))];

    for (int i = 0; i < keyPos.length; i++) {
        rec(digits, len, pos+1, new StringBuilder(ans).append(keyPos[i]));
    }

    
}

    public static void main(String[] args){
        String digits = "23";

        int lesize= digits.length();

        rec(digits, len, 0, new StringBuilder(""));
    }
}
