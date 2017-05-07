package mitocode.advanced.genericos;

/**
 * Created by Ivans on 5/1/2017.
 */
public class GenericsOne {

    public static void main(String[] args) {

        ClassGeneric<Integer> cg = new ClassGeneric<>(25);
        cg.showType();
    }

}
