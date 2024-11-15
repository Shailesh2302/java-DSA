public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}// Single level inheritance

//Base class
class Animal {
    String colour;

    void eat(){
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathe");
    }
}
// Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims isizewater");
    }
}