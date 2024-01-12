package behavioralpattern.command.commands;

import behavioralpattern.command.receiver.Dictionary;

public class EditWordCommand implements Command {
    private Dictionary dictionary;

    private String word;

    private String newMeaning;

    public EditWordCommand(Dictionary dictionary, String word, String newMeaning) {
        this.dictionary = dictionary;
        this.word = word;
        this.newMeaning = newMeaning;
    }

    public void execute() {
        this.dictionary.editWord(word, newMeaning);
    }
}
