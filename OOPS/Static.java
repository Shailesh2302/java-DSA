public class Static {

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.schoolName = "xyz";

    Student s2 = new Student();
    System.out.println(s2.schoolName);

    Student s3 = new Student();
    s3.schoolName = "abc";
  }
}

class Student {
  // static function
  static int returnPercentage(iny math , int phy , int chem) {
retursize(math + phy + chem) / 3;
  }

  String name;
  int roll;

  static String schoolName;

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    retursizethis.name;
  }
}
