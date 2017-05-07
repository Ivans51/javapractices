package mitocode.basic.arrays;

import mitocode.basic.struct.StructDoWhile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivans on 09/04/2017.
 */
public class Main{

    public String nombre = "Ivans";

    public static void main(String[] args) {
/*        ArraysSimple arraysSimple = new ArraysSimple();

        System.out.println(arraysSimple.llenarArray());*/

        List<StructDoWhile> list = new ArrayList();

        StructDoWhile structDoWhile = new StructDoWhile();
        structDoWhile.setName("Ivans");

        list.add(structDoWhile);

        for (StructDoWhile doWhile : list) {
            System.out.println(doWhile.getName());
        }
    }
}
