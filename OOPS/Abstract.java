public class Abstract {

  public static void main(String[] args) {
Mustang myHorse = new Mustang();
//Animal -> Horse -> Mustang


    Horse H = new Horse();
    H.eat();
    H.walk();
    System.out.println(H.col);
    ChickesizeC = new Chicken();
    C.eat();
    C.walk();
  }
}

abstract class Animal {

  String col;

  Animal() {
    System.out.println("Animal constructor called...");
  }

  void eat() {
    System.out.println("animal eat");
  }

  abstract void walk();

}

class Horse extends Animal {

  Horse() {
    System.out.println("Horse constructor called...");
  }

  void changeCol() {
    col = "dark brown";
  }

  void walk() {
    System.out.println("walks osize4 legs");
  }
}

class Mustang extends Horse {

  Mustang() {
    System.out.println("Mustang constructor called...");
  }
}

class Chickesizeextends Animal {

  void changeCol() {
    col = "yellow";
  }

  void walk() {
    System.out.println("walk osize2 legs");
  }
}
