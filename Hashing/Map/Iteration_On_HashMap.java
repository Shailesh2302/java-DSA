import java.util.*;

public class Iteration_On_HashMap {
    
    public static void main(String[] args) {
        HashMap<String, Integer> sh = new HashMap<>();

        sh.put("India",100);
        sh.put("China",150);
        sh.put("US",50);
        sh.put("UK",6);
        sh.put("Nepal",5);

        Set<String> keys = sh.keySet();

        System.out.println(keys);

        System.out.println("\nloops");
        for (String k : keys) {
            System.out.println(k + " : " + sh.get(k));
        }

        System.out.println("\nentry set");
        System.out.println(sh.entrySet());

    }

    
}
