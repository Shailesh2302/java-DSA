import java.util.*;
public class Tree_Map {
    
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 120);
        tm.put("China", 100);
        tm.put("USA", 20);
        tm.put("UK", 15);
        tm.put("Russia", 25);

        System.out.println(tm);
    }
}
