package CommandPattern;

public class CommandMain {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Button button = new Button();
        //Button and Text Editor are loosely coupled
        button.setCommand(new BoldCommand(textEditor));
        button.onClick();

        button.setCommand(new ItalicCommand(textEditor));
        button.onClick();
    }
}
