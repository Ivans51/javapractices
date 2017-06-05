package mitocode.java8.collectionsjava8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ivans on 5/7/2017.
 */
public class MapApp {


    private Map<Integer, String> map;

    public void town() {
        map = new HashMap<>();
        map.put(1, "Ivan");
        map.put(2, "Pedro");
        map.put(3, "Juan");
        map.put(4, "Freddy");
    }

    public void printF() {
        /*for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("key: " + e.getKey() + " - Value: " + e.getValue());
        }*/
        // map.forEach((k,v) -> System.out.println("key: " + k + " Value: " + v));
        map.entrySet().forEach(System.out::println);
    }

    public static void main(String[] args) {
        MapApp maA = new MapApp();
        maA.town();
        maA.printF();
    }
}
