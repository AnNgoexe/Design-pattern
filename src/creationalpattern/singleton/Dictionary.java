package creationalpattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private static Dictionary instance;

    private Map<String, String> wordMap;

    private Dictionary() {
        this.wordMap = new HashMap<>();
    }

    public static Dictionary getInstance() {
        if (instance == null) {
            instance = new Dictionary();
        }
        return instance;
    }

    public Map<String, String> getWordMap() {
        return wordMap;
    }

    public void setWordMap(Map<String, String> wordMap) {
        this.wordMap = wordMap;
    }

    public void addWord(String key, String value) {
        this.wordMap.put(key, value);
    }

    public void deleteWord(String key) {
        this.wordMap.remove(key);
    }

    public String getWord(String key) {
        return this.wordMap.get(key);
    }

    public boolean searchWord(String key) {
        return this.wordMap.containsKey(key);
    }
}
