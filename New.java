public class New {

  public static void main(String[] args) {
    Horse H = new Horse();
    H.eat();
    H.walk();
    System.out.println(H.col);
    Chicken C = new Chicken();
    C.eat();
    C.walk();
  }
}

abstract class Animal {

  String col;

  Animal() {
    col = "brown";
  }

  void eat() {
    System.out.println("animal eat");
  }

  abstract void walk();
}

class Horse extends Animal {

  void changeCol() {
    col = "dark brown";
  }

  void walk() {
    System.out.println("walks on 4 legs");
  }
}

class Chicken extends Animal {

  void changeCol() {
    col = "yellow";
  }

  void walk() {
    System.out.println("walk on 2 legs");
  }
}
