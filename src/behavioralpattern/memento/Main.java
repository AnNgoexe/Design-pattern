package behavioralpattern.memento;

import behavioralpattern.memento.caretaker.History;
import behavioralpattern.memento.originator.TextEditor;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        TextEditor textEditor = new TextEditor(history);

        textEditor.addText(0, "Hello");
        System.out.println("The initial status: " + textEditor.getText());

        textEditor.addText(5, " World");
        System.out.println("After adding: " + textEditor.getText());

        textEditor.deleteText(0, 5);
        System.out.println("After deleting: " + textEditor.getText());

        textEditor.restore();
        System.out.println("After restoring: " + textEditor.getText());

        textEditor.reverseText();
        System.out.println("After reversing: " + textEditor.getText());

        textEditor.sortText();
        System.out.println("After sorting: " + textEditor.getText());

        textEditor.restore();
        System.out.println("After restoring: " + textEditor.getText());
    }
}

