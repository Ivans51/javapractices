package mitocode.java8.collectionsjava8;

import java.util.Optional;

/**
 * Created by Ivans on 5/7/2017.
 */
public class OptionalApp {

    public void test(String valor) {
//        System.out.println(valor.contains("I"));
        try {
            Optional op = Optional.empty();
            op.get();
        } catch (Exception e) {
            System.out.println("No find item");
        }
    }

    public void orElse(String valor){
        Optional<String> op = Optional.ofNullable(valor);
        String s = op.orElse("predetermined");
        System.out.println(s);
    }

    public void orElseTrow(String valor){
        Optional<String> op = Optional.ofNullable(valor);
        op.orElseThrow(NumberFormatException::new);
    }

    public void isPresent(String valor){
        Optional<String> op = Optional.ofNullable(valor);
        System.out.println(op.isPresent());;
    }

    public static void main(String[] args) {
        OptionalApp opA = new OptionalApp();
        // opA.test(null);
        // opA.orElse("Ivan");
        // opA.orElseTrow(null);
        opA.isPresent(null);
    }
}
