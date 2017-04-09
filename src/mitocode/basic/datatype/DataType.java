package mitocode.basic.datatype;

/**
 * Created by Ivans on 09/04/2017.
 */
public class DataType {

    // Various and Method Constructor
    String text1, text2;

    // Primitive Data
    public int numInt = 10;
    public double numDecimal = 2.5;

    // Datos tipo Wrapper
    public Integer numPrimitivo = 10;
    public Character textWrapper = 'I';
    public Character textInstance = new Character('P');

    // Clases de Java
    public String texto = "10";
    public double result = Double.parseDouble(texto + numDecimal); // parsear dato

    // Chain char
    public char caracter = 'A';

    public DataType(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public int compareString() {
        int resultCompare = text1.compareToIgnoreCase(text2);
        return resultCompare;
    }

    public String concatenacion() {
        String concatenalo = text1.concat(text2);
        return concatenalo;
    }

    public String extraerPorcion() {
        String extraido = text1.substring(1, 3);
        return extraido;
    }

    public char typeDataString(String text) {

        text = text;
        char capture = text.charAt(0);

        return capture;
    }

}
