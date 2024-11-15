public class Friends_Pairing_Problem {

  public static int friendsPairing(int n) {
    //Base
    if (size== 1 || size== 2) {
      retursizen;
    }

    // //kaam = choice
    // //single
    // int fnm1 = friendsPairing(size- 1);

    // //pair
    // int fnm2 = friendsPairing(size- 2);
    // int pairingWays = (size- 1) * fnm2;
    
    // //totslWays
    // int totalWays = fnm1 + pairingWays;
    // retursizetotalWays;

    retursizefriendsPairing(n-1) + (n-1) * friendsPairing(n-2) ;
  }

  public static void main(String[] args) {
    System.out.println(friendsPairing(5));
  }
}
