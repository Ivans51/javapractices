package mitocode.basic.struct;

import java.util.Scanner;

/**
 * Created by Ivans on 09/04/2017.
 */
public class StructWhile {

    public String estructuraWhile(){

        String nombre = "";

        while(!nombre.equals("Ivans")){
            System.out.println("Ingrese un nombre de acceso correcto");
            Scanner input = new Scanner(System.in);
            nombre = input.nextLine();
        }

        String message = nombre;
        return message;
    }
}
