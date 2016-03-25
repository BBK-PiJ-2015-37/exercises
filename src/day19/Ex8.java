package day19;

import java.util.ArrayList;
import java.util.List;

/**
 * Rewrite transformedList so it works with generic types. Verify that your
 * examples from the previous question still work.
 */
public class Ex8 {

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
                StringUtils.elementTransformedList(wordList, s -> s + "!");
        List<String> eyeWords =
                StringUtils.elementTransformedList(wordList, s -> s.replace("i", "eye"));
        List<String> upperCaseWords =
                StringUtils.elementTransformedList(wordList, String::toUpperCase);
        List<Integer> charCount =
                StringUtils.elementTransformedList(wordList, String::length);
        System.out.println("excitingWords contains: " + excitingWords);
        System.out.println("eyeWords contains: " + eyeWords);
        System.out.println("upperCaseWords contains: " + upperCaseWords);
        System.out.println("charCount contains: " + charCount);
    }
}
