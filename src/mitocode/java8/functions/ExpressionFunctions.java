package mitocode.java8.functions;

/**
 * Created by Ivans on 5/7/2017.
 */
public class ExpressionFunctions {

    public double operation(double x, double y){
        OperationFunctional op = (n1, n2) -> n1 + n2;
        OperationFunctional op2 = new OperationFunctional() {
            @Override
            public double calculate(double n1, double n2) {
                return n1 + n2;
            }
        };
        return op2.calculate(x, y);
    }

    public static void main(String[] args) {
        ExpressionFunctions ef = new ExpressionFunctions();
        System.out.println(ef.operation(3, 5));
    }

}
