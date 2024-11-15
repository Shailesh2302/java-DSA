public class MultiLevelInheritance {

  public static void main(String[] args) {
    // Fish shark = new Fish();
    // shark.eat();

    Dogs dobby = new Dogs();
    dobby.eat();
    dobby.legs = 4;
    System.out.println(dobby.legs);
  }
} // Single level inheritance

//Base class
class Animal {

  String colour;

  void eat() {
    System.out.println("eats");
  }

  void breathe() {
    System.out.println("breathe");
  }
}

// Derived class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swims isizewater");
//     }
// }

// Derived from Animal
class Mammals extends Animal {

  int legs;
}

// Derived from mammals
class Dogs extends Mammals {

  String breed;
}
