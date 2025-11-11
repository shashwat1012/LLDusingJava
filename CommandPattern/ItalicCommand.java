package CommandPattern;

public class ItalicCommand implements Command{
    TextEditor textEditor;

    public ItalicCommand(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    public void execute(){
        textEditor.ItalicText();
    }
}
