package behavioralpattern.command.invoker;

import behavioralpattern.command.commands.*;
import behavioralpattern.command.receiver.Dictionary;

public class MenuOptions {
    private Dictionary dictionary;

    private Command addWordCommand;

    private Command editWordCommand;

    private Command deleteWordCommand;

    private Command searchWordCommand;

    public MenuOptions(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void addWord(String word, String meaning) {
        addWordCommand = new AddWordCommand(dictionary, word, meaning);
        addWordCommand.execute();
    }

    public void editWord(String word, String newMeaning) {
        editWordCommand = new EditWordCommand(dictionary, word, newMeaning);
        editWordCommand.execute();
    }

    public void deleteWord(String word) {
        deleteWordCommand = new DeleteWordCommand(dictionary, word);
        deleteWordCommand.execute();
    }

    public void searchWord(String word) {
        searchWordCommand = new SearchWordCommand(dictionary, word);
        searchWordCommand.execute();
    }
}

