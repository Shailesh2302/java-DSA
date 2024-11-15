public class RemoveDuplicatesIn_A_String {


    public static void removeDuplicate(String str ,int idx,StringBuilder newStr ,booleasizemap[]) {
        //Base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //Kaam
        char currChar = str.charAt(idx);
        if (map[currChar-'a'] == true) {
            //Duplicate
            removeDuplicate(str, idx+1, newStr, map);
        }else {
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appannacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
