package mitocode.java8.expressionlambdas;

/**
 * Created by Ivans on 5/3/2017.
 */
public class ExpressionLambdas implements OperationA {

    final double n3 = 4;

    public void tryScope() {
        OperationA op = new OperationA() {
            @Override
            public double addOperation(double n1, double n2) {
                return n3 + n1 + n2;
            }
        };
        System.out.println(op.addOperation(3, 2));
    }

    public double tryOperation() {

        OperationA operationA = (x, y) -> {
            return x + y + n3;
        };
        return operationA.addOperation(3, 2);

    }

    /* Main run */

    public static void main(String[] args) {
        ExpressionLambdas ep = new ExpressionLambdas();
        ep.tryScope();
        ep.talk("Ivan");
        ep.talk("Pedro");
    }

    @Override
    public double addOperation(double n1, double n2) {
        return 0;
    }
}
