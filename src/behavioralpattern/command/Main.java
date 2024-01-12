package behavioralpattern.command;

import behavioralpattern.command.invoker.MenuOptions;
import behavioralpattern.command.receiver.Dictionary;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        MenuOptions menu = new MenuOptions(dictionary);

        menu.addWord("Hello", "Xin chào");
        menu.editWord("Hello", "Chào bạn");
        menu.searchWord("Hello");
        menu.deleteWord("Hello");
        menu.searchWord("Hello");
    }
}
