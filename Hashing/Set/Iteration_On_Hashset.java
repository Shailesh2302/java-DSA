import java.util.*;

public class Iteration_On_Hashset {

    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Bengaluru");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");

        // Iterator it = cities.iterator();

        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
