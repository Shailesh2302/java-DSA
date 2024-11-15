public class TypesOfConstructor {

  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("shailesh");
    Student s3 = new Student(33);
    
  }
}

class Student {

  String name;
  int roll;

  Student() {
    System.out.println("Constructor is called...");
  }

  Student(String name) {
    this.name = name;
  }

  Student(int roll) {
    this.roll = roll;
  }
}
