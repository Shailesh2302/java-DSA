public class Constructors {
    public static void main(String[] args) {
       Student s1 = new Student(); 
    //    System.out.println(s1.name);
    }
}

class Student{
    String name;
    int rollNo;
    Student(/*String name */){
        System.out.println("Constructor is called...");
        // this.name=name;
    }
}
