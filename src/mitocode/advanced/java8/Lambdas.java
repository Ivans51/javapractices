package mitocode.advanced.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Ivans on 4/28/2017.
 */
public class Lambdas {


    public void order() {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Juan");
        list.add("Carlos");

/*        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        Collections.sort(list, (String p1, String p2) -> p1.compareTo(p2));

        for (String s : list) {
            System.out.println(s);
        }
    }



    public static void main(String[] args) {
        Lambdas lambdas = new Lambdas();
        lambdas.order();
    }
}
