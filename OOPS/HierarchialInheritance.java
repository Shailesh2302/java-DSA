/**
 * HierarchialInheritance
 */
public class HierarchialInheritance {
    

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
      
      
      
      // Derived from Animal
      class Mammals extends Animal {
      
       void walk() {
        System.out.println("walks");
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