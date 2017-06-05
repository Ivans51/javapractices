package mitocode.advanced.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by Ivans on 4/26/2017.
 */
public class MapClass {

    public void mapUsage(){

        Map<String, String> map = new HashMap<>();
        map.put("uno", "Ivans");
        map.put("dos", "Pedro");
        map.put("tres", "Yarold");
        map.put("cuatro", "Juan");

        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            System.out.println("Key: " + key + " - valor: " + map.get(key));
        }

    }

    public void mapUsageWithClass(){

        Map<Persona, String> classMap = new HashMap<>();
        classMap.put(new Persona(1, "ivans", 22), "Hola");
        classMap.put(new Persona(2, "Juan", 25), "Mundo");
        classMap.put(new Persona(3, "Pedro", 24), "Soñar");
        classMap.put(new Persona(4, "Ricardo", 22), "Java");

        /* Other way show map */
        for (Entry<Persona, String> ent : classMap.entrySet()) {
            //System.out.println("Key: " + ent.getKey(), "Value: " + ent.getValue());
        }

    }

}
