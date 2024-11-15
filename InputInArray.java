import java.util.*;

public class InputInArray {

  public static void main(String[] args) {
    int marks[] = new int[100];

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the phy marks:");
    marks[0] = sc.nextInt();

    System.out.println("Enter the che marks:");

    marks[1] = sc.nextInt();

    System.out.println("Enter the math marks:");

    marks[2] = sc.nextInt();

    System.out.println("phy marks :" + marks[0]);
    System.out.println("che marks :" + marks[1]);
    System.out.println("math marks :" + marks[2]);

    marks[2] = marks[2] + 10; // updating the value

    System.out.println("math marks :" + marks[2]);

    int percentage = (marks[0] + marks[1] + marks[2]) / 3;

    System.out.println("peecentage are : " + percentage + "%");

    System.out.println("length of Array : " + marks.length);
  }
}
