package behavioralpattern.memento.caretaker;

import behavioralpattern.memento.memento.Memento;
import behavioralpattern.memento.originator.TextEditor;

import java.util.Stack;

public class History {
    private Stack<Memento> history = new Stack<>();

    public void save(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public Memento getLastSavedState() {
        if (!history.isEmpty()) {
            history.pop();
            return history.peek();
        }
        return null;
    }
}
