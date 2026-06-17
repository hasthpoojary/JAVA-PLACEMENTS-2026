
import java.util.*;

public class FirstNonRepeating {

    public static char firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return '_';
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }

        return '_';
    }

    public static void main(String[] args) {
        Object[][] tests = {
            {"swiss", 'w'},
            {"aabb", '_'},
            {"", '_'},
            {"a", 'a'},
            {"abacabad", 'c'},
            {"!@!!@", '@'},
            {"aaabbbccc", '_'}
        };
        int passed = 0;
        for (int i = 0; i < tests.length; i++) {
            String input = (String) tests[i][0];
            char expected = (char) tests[i][1];
            char result = firstUniqChar(input);
            if (expected == result) {
                passed++;
                System.out.println("Test " + (i + 1) + " passed");
            } else {
                System.out.println("Test " + (i + 1) + " FAILED");
                System.out.println("Input: " + input);
                System.out.println("Expected: " + expected + " but got: " + result);
            }
        }
        System.out.println(passed + "/" + tests.length + " tests passed");
    }
}
