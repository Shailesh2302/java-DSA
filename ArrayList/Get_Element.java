import java.util.ArrayList;
public class Get_Element {
 
    public static void main(String[] args) {
     
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

       int element = list.get(1);
       System.out.println(element);

        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        
        // System.out.println(list);

        list.get(2);

        for (int i = 0; i < 14; i++) {
            list.get(i);
        }
        System.out.println(list);
    }
}
