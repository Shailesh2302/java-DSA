public class SubString {

//   public static void subString(String name) {
//     for (int k = 0; k < name.length(); k++) {
//       for (int i = k; i < name.length(); i++) {
//         for (int j = k; j <= i; j++) {
//           System.out.print(name.charAt(j) + " ");
//         }
//         System.out.println();
//       }
//       System.out.println();
//     }
//   }

public static String subString(String name,int si ,int ei ) {
String Substr = "";
for (int i = si; i < ei; i++) {
    Substr += name.charAt(i);
}
return Substr;
}

  public static void main(String[] args) {
    String name = "Jay Shree ramesh";

   // subString(name);
   System.out.println(name.substring(0,13));
   System.out.println(subString(name, 0, 13));
  }
}
