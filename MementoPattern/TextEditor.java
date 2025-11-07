package MementoPattern;

public class TextEditor {

    private String content;

    public void write(String text){
        this.content = text;
    }

    public String read(){
        return content;
    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento editorMemento){
        content = editorMemento.getEditorState();
    }
}
