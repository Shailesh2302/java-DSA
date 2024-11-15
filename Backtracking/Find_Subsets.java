public class Find_Subsets {

    public static void findSubset(String str, String ans, int i ) {
        //base case
        if (i == str.length()) {
          if (ans.length() == 0) {
             System.out.println("NULL");
            
          }else{
            System.out.println(ans);
          }
          return;
        }
        //Recursiosize

        //Yes choice
        findSubset(str, ans+str.charAt(i), i+1);

        //No choice
        findSubset(str, ans, i + 1);//abc ab ac a bc b c
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}
