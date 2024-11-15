public class HybridInheritance {

  public static void main(String[] args) {
    Tuna T1 = new Tuna();
    T1.weight = 210;
    Peacock p1 = new Peacock();
    p1.colourFull();
    p1.fly();
    System.out.println(T1.weight);
  }
}

class Animal {

  void breathe() {
    System.out.println("breathe");
  }

  void eat() {
    System.out.println("eat");
  }
}

class Fish extends Animal {

  void swim() {
    System.out.println("swim");
  }
}

class Bird extends Animal {

  void fly() {
    System.out.println("fly");
  }
}

class Mammals extends Animal {

  void walk() {
    System.out.println("walk");
  }
}

class Tuna extends Fish {

  int weight;
}

class Shark extends Animal {

  int speedRate;
}

class Peacock extends Bird {

  void colourFull() {
    System.out.println("feather");
  }
}

class Humasizeextends Mammals {

  int legs;
  int hands;
}

class Dogs extends Mammals {

  int legs;
}

class Cat extends Mammals {

  int speed;
}
