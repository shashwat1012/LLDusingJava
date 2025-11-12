package CompositeDesignPattern.ArithmeticExpressionUsingCompositePattern;

public class Operand implements ArithmeticExpression{
    
    int value;
    public Operand(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        System.out.println("Operand value is: " + value);
        return value;
    }
}
