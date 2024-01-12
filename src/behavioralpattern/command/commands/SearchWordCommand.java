package behavioralpattern.command.commands;

import behavioralpattern.command.receiver.Dictionary;

public class SearchWordCommand implements Command {
    private Dictionary dictionary;

    private String word;

    public SearchWordCommand(Dictionary dictionary, String word) {
        this.dictionary = dictionary;
        this.word = word;
    }

    public void execute() {
        this.dictionary.searchWord(word);
    }
}
