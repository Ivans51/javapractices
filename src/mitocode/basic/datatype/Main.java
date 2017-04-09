package mitocode.basic.datatype;

/**
 * Created by Ivans on 08/04/2017.
 * Tipos de datos en Java
 */
public class Main {

    public static void main(String[] args) {

        DataType dataType = new DataType("Hola", " Ivans");

        // Character escape
        System.out.println("Hoal Ivans \neste es el curso de java");

        // Instance of a Object
        System.out.println("Una instancia de un atributo " + dataType.result);

        // String text
        System.out.println("Cadena de texto tipo String con su metodo " + dataType.typeDataString("Ivans"));

        // Method compare
        System.out.println("Si son iguales es 0: " + dataType.compareString());

        // Method concat
        System.out.println("Si son iguales es 0: " + dataType.concatenacion());

        // Method subString
        System.out.println("Extrae una porción de la palabra: " + dataType.extraerPorcion());

    }

}
