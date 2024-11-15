/**
 * AssignName
 */
public class AssignName {

  public static void main(String[] args) {
    Student S = new Student();
    S.name = "Itachi uchiha";
    System.out.println(S.name);
  }
}

class Student {
  String name;
  int roll;
}