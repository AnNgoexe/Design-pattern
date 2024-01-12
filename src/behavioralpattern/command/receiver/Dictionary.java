package behavioralpattern.command.receiver;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> words = new HashMap<>();

    public void addWord(String word, String meaning) {
        if (!words.containsKey(word)) {
            words.put(word, meaning);
            System.out.println("Added word: " + word);
        } else {
            System.out.println("The word " + word + " has been in dictionary.");
        }
    }

    public void editWord(String word, String newMeaning) {
        if (words.containsKey(word)) {
            words.put(word, newMeaning);
            System.out.println("Edited word: " + word);
        } else {
            System.out.println("Word not found");
        }
    }

    public void deleteWord(String word) {
        if (words.containsKey(word)) {
            words.remove(word);
            System.out.println("Deleted word: " + word);
        } else {
            System.out.println("Word not found");
        }
    }

    public void searchWord(String word) {
        if (words.containsKey(word)) {
            System.out.println("Word: " + word + ", Meaning: " + words.get(word));
        } else {
            System.out.println("Word not found");
        }
    }
}
