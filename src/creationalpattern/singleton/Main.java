package creationalpattern.singleton;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary1 = Dictionary.getInstance();
        Dictionary dictionary2 = Dictionary.getInstance();

        System.out.println("Are dictionary1 and dictionary2 the same instance? " + (dictionary1 == dictionary2));

        dictionary1.addWord("hello", "xin chào");
        dictionary2.addWord("world", "thế giới");

        System.out.println("Word for 'hello' in dictionary1: " + dictionary1.getWord("hello"));
        System.out.println("Word for 'world' in dictionary2: " + dictionary2.getWord("world"));

        dictionary1.deleteWord("hello");

        System.out.println("After deleting 'hello' from dictionary1, word for 'hello': " + dictionary1.getWord("hello"));

        System.out.println("Is 'world' present in dictionary2? " + dictionary2.searchWord("world"));
        System.out.println("Is 'hello' present in dictionary2? " + dictionary2.searchWord("hello"));
    }
}
