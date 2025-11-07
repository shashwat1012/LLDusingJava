package MementoPattern;

import java.util.Stack;

public class CareTaker {

    private Stack<EditorMemento> history = new Stack<>();

    public void saveEditorState(TextEditor textEditor){
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor){
        if(!history.empty()){
            history.pop();
            EditorMemento editorMemento = history.peek();
            textEditor.restore(editorMemento);
        }
    }

}
