package mitocode.advanced.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ivans on 4/24/2017.
 */
public class SetHash {

    Set<Persona> lista = new HashSet<>();

    public void tourNoOrder(){
        lista.add(new Persona(12, "Ivans", 22));
        lista.add(new Persona(15, "Pedro", 25));
        lista.add(new Persona(13, "Juan", 28));
        lista.add(new Persona(14, "Ivans", 24));

        for (Persona tour : lista) {
            System.out.println(tour.getName());
        }
    }
}
