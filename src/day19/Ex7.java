package day19;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a static method called transformedList. It should take a List of
 * Strings and a Function<String,String> and return a new List that contains the
 * results of applying the function to each element of the original list.
 */
public class Ex7 {

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("bin");
        wordList.add("crab");
        wordList.add("dumpling");
        wordList.add("egg");
        wordList.add("frog");
        wordList.add("gib");
        System.out.println("wordList contains: " + wordList);
        List<String> excitingWords =
                StringUtils.transformedList(wordList, s -> s + "!");
        List<String> eyeWords =
                StringUtils.transformedList(wordList, s -> s.replace("i", "eye"));
        List<String> upperCaseWords =
                StringUtils.transformedList(wordList, String::toUpperCase);
        System.out.println("excitingWords contains: " + excitingWords);
        System.out.println("eyeWords contains: " + eyeWords);
        System.out.println("upperCaseWords contains: " + upperCaseWords);
    }
}
