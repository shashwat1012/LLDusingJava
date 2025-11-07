package MementoPattern;

public class TextEditorMain {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CareTaker careTaker = new CareTaker();

        textEditor.write("Hello Booba");

        careTaker.saveEditorState(textEditor);

        textEditor.write("Hello Bubu");

        careTaker.saveEditorState(textEditor);

        careTaker.undo(textEditor);

        System.out.println(textEditor.read());


    }
}
