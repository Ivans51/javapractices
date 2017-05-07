package mitocode.basic.struct;

import java.util.Scanner;

/**
 * Created by Ivans on 09/04/2017.
 */
public class StructSwitch {

    public String esctructuraSwitch() {
        Scanner sc = new Scanner(System.in);
        String valor, resultado = sc.nextLine();

        switch (resultado) {
            case "Mito":
                valor = "Hola Mito";
                break;
            case "Ivans":
                valor = "Hola Ivans";
                break;
            default:
                valor =  "Hola defecto";

        }
        return valor;
    }

}
