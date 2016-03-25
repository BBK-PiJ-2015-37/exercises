package day19;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a static method called allMatches. It should take a List of Strings
 * and a Predicate<String>, and return a new List of all the values that passed the
 * test. Test it with several examples.
 */
public class Ex5 {

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("bee");
        wordList.add("crab");
        wordList.add("dumpling");
        wordList.add("egg");
        wordList.add("frog");
        wordList.add("gib");
        System.out.println("wordList contains: " + wordList);
        List<String> shortWords = StringUtils.allMatches(wordList,
                s -> s.length() < 4);
        List<String> wordsWithB = StringUtils.allMatches(wordList,
                s -> s.contains("b"));
        List<String> evenLengthWords = StringUtils.allMatches(wordList,
                s -> (s.length() % 2) == 0);
        System.out.println("shortWords contains: " + shortWords);
        System.out.println("wordsWithB contains: " + wordsWithB);
        System.out.println("evenLengthWords contains: " + evenLengthWords);
    }
}
