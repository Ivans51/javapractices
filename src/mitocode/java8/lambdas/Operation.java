package mitocode.java8.lambdas;

/**
 * Created by Ivans on 5/3/2017.
 */
public interface Operation {

    double addOperation(double n1, double n2);

    default public void talk(String name) {
        System.out.println("Hello " + name);
    }

}