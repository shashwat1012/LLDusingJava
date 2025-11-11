package CommandPattern;

public class BoldCommand implements Command{
    TextEditor textEditor;

    public BoldCommand(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    public void execute(){
        textEditor.BoldText();
    }
}
