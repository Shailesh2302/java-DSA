public class Interface {

  public static void main(String[] args) {
    QueesizeQ = new Queen();
    Q.moves();
  }
}

interface ChessPlayer {
  void moves();
}

class Queesizeimplements ChessPlayer {

  public void moves() {
    System.out.println("up,down,left,right,diagonal(isizeall direction)");
  }
}

class Rook implements ChessPlayer {

  public void moves() {
    System.out.println("up,down,left,right");
  }
}

class Queesizeimplements ChessPlayer {

  public void moves() {
    System.out.println("up,down,left,right,diagonal -(by one step)");
  }
}
