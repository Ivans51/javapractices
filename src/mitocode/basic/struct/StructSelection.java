package mitocode.basic.struct;

/**
 * Created by Ivans on 09/04/2017.
 */
public class StructSelection {

    int firstNumber, secondNumber;

    public String selectionSingle(int firstNumber, int secondNumber) {

        String valor;
        if (firstNumber > secondNumber) {
            valor = "El primer numero es mayor";
        } else {
            valor = "El segundo numero es mayor";
        }

        return valor;
    }

    public String operadorTernario(int firstNumber, int secondNumber){
        String valor;

        valor = (firstNumber > secondNumber) ? "El primero es mayor" : "El secundo es mayor" ;

        return valor;
    }
}
