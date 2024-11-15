public class Super {

  public static void main(String[] args) {
    Horse H1 = new Horse();
    System.out.println(H1.color);
  }
}

class Animal {

  String color;

  Animal() {
    System.out.println("Animal constructor is called... ");
  }
}

class Horse extends Animal {

  Horse() {
    super.color = "brown";
    System.out.println("Horse constructor is called...");
  }
}
