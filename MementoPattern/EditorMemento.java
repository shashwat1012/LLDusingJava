package MementoPattern;

public class EditorMemento {
    private final String content;

    public EditorMemento(String content){
        this.content = content;
    }

    public String getEditorState(){
        return content;
    }
}
