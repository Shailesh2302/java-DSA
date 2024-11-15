import java.util.*;

public class Linked_HashSet {

    public static void main(String[] args) {
        
HashSet<String> cities = new HashSet<>();

cities.add("Begaluru");
cities.add("Delhi");
cities.add("Noida");
cities.add("Mumbai");
cities.add("Pune");
System.out.println(cities);

LinkedHashSet<String> lhs = new LinkedHashSet<>();

lhs.add("Begaluru");
lhs.add("Delhi");
lhs.add("Noida");
lhs.add("Mumbai");
lhs.add("Pune");

System.out.println(lhs);
    }
}
