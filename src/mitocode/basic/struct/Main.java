package mitocode.basic.struct;

/**
 * Created by Ivans on 09/04/2017.
 */
public class Main {

    public static void main(String[] args) {

        // Instance
        StructSelection structSelection = new StructSelection();
        StructWhile structWhile = new StructWhile();
        StructFor structFor = new StructFor();
        StructDoWhile structDoWhile = new StructDoWhile();
        // StructSwitch structSwitch = new StructSwitch();

        // Message in console hola new
        System.out.println("Selección Simple " + structSelection.selectionSingle(5, 10));
        System.out.println("Operador ternario" + structSelection.operadorTernario(10, 5));

        System.out.println("El valor es: " + structWhile.estructuraWhile());

        System.out.println("El valor es: " + structDoWhile.estructuraDoWhile());
        System.out.println("El valor es: " + structSwitch.esctructuraSwitch());

    }
}
