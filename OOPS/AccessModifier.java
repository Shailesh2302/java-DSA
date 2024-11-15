public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
myAcc.useraname="shailesh kanfade";
myAcc.setPassword("abcdefghijkl");
System.out.println(myAcc.useraname);
    }
}
class BankAccount {
   public String useraname;
   private String Password;
   public void setPassword(String pwd){
Password = pwd;
   }
}
