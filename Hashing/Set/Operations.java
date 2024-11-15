import java.util.*;
public class Operations {
    
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(2);

        System.out.println(set);

        System.out.println(set.contains(2));
        System.out.println(set.contains(3));
        System.out.println(set.remove(4));
        System.out.println(set);
    }
}
