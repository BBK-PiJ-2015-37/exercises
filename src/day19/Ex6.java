package day19;

import java.util.ArrayList;
import java.util.List;

/**
 * Rewrite allMatches so it works on any List and associated Predicate, not
 just on Strings. Verify that your examples from Ex5 still work.
 */
public class Ex6 {

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
        List<String> shortWords = StringUtils.elementAllMatches(wordList,
                s -> s.length() < 4);
        List<String> wordsWithB = StringUtils.elementAllMatches(wordList,
                s -> s.contains("b"));
        List<String> evenLengthWords = StringUtils.elementAllMatches(wordList,
                s -> (s.length() % 2) == 0);
        System.out.println("shortWords contains: " + shortWords);
        System.out.println("wordsWithB contains: " + wordsWithB);
        System.out.println("evenLengthWords contains: " + evenLengthWords);

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 15; i ++) {
            intList.add(i);
        }
        System.out.println("intList contains: " + intList);
        List<Integer> oddInts = StringUtils.elementAllMatches(intList,
                s -> s % 2 == 1);
        List<Integer> intsLessThanTen = StringUtils.elementAllMatches(intList,
                s -> s < 10);
        List<Integer> multiplesOfThree = StringUtils.elementAllMatches(intList,
                s -> s % 3 == 0);
        System.out.println("oddInts contains: " + oddInts);
        System.out.println("intsLessThanTen contains: " + intsLessThanTen);
        System.out.println("multiplesOfThree contains: " + multiplesOfThree);
    }
}
