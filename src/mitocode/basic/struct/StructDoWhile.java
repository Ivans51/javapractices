package mitocode.basic.struct;

import java.util.Scanner;

/**
 * Created by Ivans on 09/04/2017.
 */
public class StructDoWhile {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String estructuraDoWhile() {

        String opcion;

        do {
            System.out.println("Ingrese un nombre correcto: ");
            Scanner input = new Scanner(System.in);
            opcion = input.nextLine();
        } while (!opcion.equals("Ivans"));

        return opcion;
    }
}
