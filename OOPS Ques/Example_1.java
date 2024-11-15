class MainProgram {

  MainProgram() {
    System.out.println("default constructor");
  }

  MainProgram(int a) {
    System.out.println("Constructor overloading");
    System.out.println("Parameterized constructor" + a);
  }

  //   public static void main(String[] args) {
  //     System.out.println("Hello World");
  //   }
  void getName(String firstName, String lastName) {
    System.out.println("Full name ::" + firstName + " " + lastName);
  }

  void getName(String FullName) {
    System.out.println("Method Overloading");
    System.out.println("FullName::" + FullName);
  }
}

class Test extends MainProgram {

  void getName(String name) {
    System.out.println("overrided Method");
    System.out.println("Name is : " + name);
  }
}

class Example_1 {

  public static void main(String[] args) {
    // Example_1 T = new Example_1();
    // Example_1 T1 = new Example_1(3);

    // T1.getName("Virat Kohli");
    // T1.getName("shailesh", "kanfade");

    MainProgram m1 = new MainProgram();
    m1.getName("Virat kohli");

    MainProgram m2 = new Test();
    m2.getName("messi");
  }
}
