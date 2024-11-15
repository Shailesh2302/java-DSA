import java.util.*;

public class LinearSearch {

  public static int FindNumber(int number[], int key) {
    for (int i = 0; i < number.length; i++) {
      if (number[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static int find(String Food[], String key1) {
    for (int i = 0; i < Food.length; i++) {
      if (Food[i] == key1) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the food : ");
    String key1;

    int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    String Food[] = new String[1000];

    Food[0] = "samosa";
    Food[1] = "panipuri";
    Food[2] = "jalebi";
    Food[3] = "kajukatli";
    Food[4] = "kachori";
    Food[5] = "pavbhaji";
    //{
    //   "panipuri",
    //   "samosa",
    //   "kachori",
    //   "pavbhaji",
    //   "jalebi",
    //   "kajukatli",
    // };
    // System.out.print("Enter the number : ");
    // int key = sc.nextInt();

    // int index = FindNumber(number, key);

    // if (index == -1) {
    //   System.out.println("Not Found");
    // } else {
    //   System.out.println("Key is at Index : " + index);
    // }

    int index1 = find(Food, "panipuri");
    if (index1 == -1) {
      System.out.println("Not found");
    } else {
      System.out.println("key is at index : " + index1);
    }
  }
}
