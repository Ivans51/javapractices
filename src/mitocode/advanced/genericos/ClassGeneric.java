package mitocode.advanced.genericos;

/**
 * Created by Ivans on 5/1/2017.
 */
public class ClassGeneric<T> {

    private T objeto;

    public ClassGeneric(T objeto){

        this.objeto = objeto;

    }

    public void showType(){
        System.out.println("El tipo T es:" + objeto.getClass().getName());
    }

}
