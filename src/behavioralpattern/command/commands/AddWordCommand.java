package behavioralpattern.command.commands;

import behavioralpattern.command.receiver.Dictionary;

public class AddWordCommand implements Command {
    private Dictionary dictionary;

    private String word;

    private String meaning;

    public AddWordCommand(Dictionary dictionary, String word, String meaning) {
        this.dictionary = dictionary;
        this.word = word;
        this.meaning = meaning;
    }

    public void execute() {
        this.dictionary.addWord(word, meaning);
    }
}
