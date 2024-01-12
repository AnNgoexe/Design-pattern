package behavioralpattern.command.commands;

import behavioralpattern.command.receiver.Dictionary;

public class DeleteWordCommand implements Command {
    private Dictionary dictionary;

    private String word;

    public DeleteWordCommand(Dictionary dictionary, String word) {
        this.dictionary = dictionary;
        this.word = word;
    }

    public void execute() {
        dictionary.deleteWord(word);
    }
}
