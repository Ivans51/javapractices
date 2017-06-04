package mitocode.java8.expressionlambdas;

/**
 * Created by Ivans on 5/3/2017.
 */
public interface OperationA {

    double addOperation(double n1, double n2);

    default void talk(String name) {
        System.out.println("Hello " + name);
    }

}