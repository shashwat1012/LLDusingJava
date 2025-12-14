package InterpreterPattern;

public class Client {
    
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a",2);
        context.put("b",3);
        context.put("c",4);
        context.put("d",5);
        TerminalExpression terminalExpressionA = new TerminalExpression("a");
        TerminalExpression terminalExpressionB = new TerminalExpression("b");
        TerminalExpression terminalExpressionC = new TerminalExpression("c");
        TerminalExpression terminalExpressionD = new TerminalExpression("d");

        AbstractExpression expression = new BinaryNonTerminalExpression((new BinaryNonTerminalExpression(terminalExpressionA,terminalExpressionB,'*')),(new BinaryNonTerminalExpression(terminalExpressionC, terminalExpressionD,'*')),'+');
        System.out.println(expression.interpret(context));
    }
}
