import java.util.*;
public class LinkedHashMap_ {
    
    public static void main(String[] args) {
        
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 120) ;
        lhm.put("China", 100) ;
        lhm.put("USA", 20);
        lhm.put("UK", 10);
        lhm.put("Russia", 25);

      System.out.println(lhm);

    }
}
