package behavioralpattern.memento.originator;

import behavioralpattern.memento.caretaker.History;
import behavioralpattern.memento.memento.Memento;

import java.util.Arrays;

public class TextEditor {
    private StringBuilder text = new StringBuilder();
    private History history;

    public TextEditor(History history) {
        this.history = history;
    }

    public void addText(int position, String newText) {
        if (position <= text.length()) {
            text.insert(position, newText);
        }
        history.save(this);
    }

    public void deleteText(int start, int end) {
        if (start >= 0 && end <= text.length()) {
            text.delete(start, end);
        }
        history.save(this);
    }

    public void reverseText() {
        text.reverse();
        history.save(this);
    }

    public void sortText() {
        char tempArray[] = text.toString().toCharArray();
        Arrays.sort(tempArray);
        text = new StringBuilder(new String(tempArray));
        history.save(this);
    }

    public String getText() {
        return text.toString();
    }

    public Memento save() {
        return new Memento(text.toString());
    }

    public void restore() {
        Memento snapshot = history.getLastSavedState();
        if (snapshot != null) {
            text = new StringBuilder(snapshot.getText());
        }
    }
}