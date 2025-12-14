package InterpreterPattern;

public class TerminalExpression implements AbstractExpression{

    String strVariable;

    public TerminalExpression(String strVariable) {
        this.strVariable = strVariable;
    }
    @Override
    public int interpret(Context context) {
        return context.get(strVariable);
    }
}
