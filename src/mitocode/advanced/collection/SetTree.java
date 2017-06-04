package mitocode.advanced.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ivans on 4/24/2017.
 */
public class SetTree {

    Set<Persona> lista = new TreeSet<>();

    public void tourOrden(){
        lista.add(new Persona(12, "Pedro", 22));
        lista.add(new Persona(15, "Pedro", 25));
        lista.add(new Persona(13, "Juan", 28));
        lista.add(new Persona(14, "Ivans", 24));

        for (Persona tour : lista) {
            System.out.println(tour.getName() + " - " + tour.getAge());
        }
    }

}
