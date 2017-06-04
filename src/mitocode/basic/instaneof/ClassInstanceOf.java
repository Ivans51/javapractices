package mitocode.basic.instaneof;

/**
 * Created by Ivans on 4/16/2017.
 */
public class ClassInstanceOf {

    public void methodInstance(){

        String valor = new String("Hola");

        if (valor instanceof String)
            System.out.println("Hola Mundo");
    }
}
