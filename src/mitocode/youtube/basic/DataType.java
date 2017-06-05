package mitocode.youtube.basic;

/**
 * Created by Ivans on 09/04/2017.
 */
public class DataType {

    // Datos Primitos
    public int numInt = 10;
    public double numDecimal = 2.5;

    // Datos tipo Wrapper
    public Integer numPrimitivo = 10;
    public Character textWrapper = 'I';
    public Character textInstance = new Character('P');

    // Clases de Java
    public String texto = "10";
    public double result = Double.parseDouble(texto + numDecimal); // parsear dato

    // Cadena char
    public char caracter = 'A';

}
