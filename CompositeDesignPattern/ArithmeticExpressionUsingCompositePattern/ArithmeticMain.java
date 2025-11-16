package CompositeDesignPattern.ArithmeticExpressionUsingCompositePattern;

public class ArithmeticMain {
    
    public static void main(String args[]){

        //2*(1+7)

       /*

                         *
                       /   \
                     2      +
                           / \
                          1   7

        */


        ArithmeticExpression two = new Operand(2);

        ArithmeticExpression one = new Operand(1);
        ArithmeticExpression seven = new Operand(7);

        ArithmeticExpression addExpression = new Expression(one,seven, Operation.ADD);

        ArithmeticExpression parentExpression = new Expression(two,addExpression, Operation.MULTIPLY);

        System.out.println(parentExpression.evaluate());


    }

}
