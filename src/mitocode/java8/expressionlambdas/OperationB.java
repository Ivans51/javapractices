package mitocode.java8.expressionlambdas;

/**
 * Created by Ivans on 5/7/2017.
 */
public interface OperationB {

    default void talk(String name) {
        System.out.println("Operation B " + name);
    }
}
