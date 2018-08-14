package mitocode.java8.lambdas;

/**
 * Created by Ivans on 5/3/2017.
 */
public class ExpressionLambdas implements Operation {

    double n3; // Hello 2

    Operation op = new Operation() {
        @Override
        public double addOperation(double n1, double n2) {
            n3 = n1 + n2;
            return n3;
        }
    };

    public double tryOperation(){

        // Changes four
        Operation operation = (x, y) -> {
            n3 = x + y;
            return n3;
        };
        return operation.addOperation(3, 2);

    }

    public static void main(String[] args) {
        ExpressionLambdas ep = new ExpressionLambdas();
        // Changes two
        System.out.println(ep.tryOperation());
        // changes one
        // Changes Three
        // Changes five
    }

    @Override
    public double addOperation(double n1, double n2) {
        return 0;
    }

    @Override
    public void talk(String name) {

    }
}
