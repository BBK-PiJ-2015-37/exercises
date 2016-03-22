package day19;

/**
 * Class created to contact static method required for Ex2.
 */
public class StringUtils {

    public static int eChecker(String s1, String s2) {
        if (s1.contains("e") && !s2.contains("e")) {
            return -1;
        } else if (!s1.contains("e") && s2.contains("e")) {
            return 1;
        } else {
            return 0;
        }
    }
}
