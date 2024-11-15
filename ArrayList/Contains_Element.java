import java.util.ArrayList;

public class Contains_Element {
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
   

    for (int i = 0; i < 11; i++) {
        list.add(i);
    }
   
    System.out.println(list.contains(4));
    System.out.println(list.contains(11));

   
   }
    


}
