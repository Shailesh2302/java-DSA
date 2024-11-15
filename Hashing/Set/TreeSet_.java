import java.util.*;

public class TreeSet_ {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Begaluru");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Mumbai");
        cities.add("Pune");
        System.out.println(cities);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Begaluru");
        ts.add("Delhi");
        ts.add("Noida");
        ts.add("Mumbai");
        ts.add("Pune");

        System.out.println(ts);

    }
}
