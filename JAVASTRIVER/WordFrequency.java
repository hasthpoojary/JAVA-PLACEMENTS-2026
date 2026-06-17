import java.util.*;

public class WordFrequency {
    public static String wordFrequency(List<String> words) {
        if (words.isEmpty()) return "";

        // Step 1: Count frequencies using a Map
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Step 2: Sort keys alphabetically
        List<String> sortedKeys = new ArrayList<>(freqMap.keySet());
        Collections.sort(sortedKeys);

        // Step 3: Build the output string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sortedKeys.size(); i++) {
            String key = sortedKeys.get(i);
            sb.append(key).append(": ").append(freqMap.get(key));
            if (i < sortedKeys.size() - 1) {
                sb.append("\n"); // add newline except after last
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test cases: each element is {input list, expected output string}
        Object[][] tests = {
                { Arrays.asList("banana", "apple", "banana", "apple", "cherry"),
                        "apple: 2\nbanana: 2\ncherry: 1" },
                { Arrays.asList("z", "a", "z"),
                        "a: 1\nz: 2" },
                { Collections.emptyList(),
                        "" },
                { Arrays.asList("single"),
                        "single: 1" },
                { Arrays.asList("aaa", "aaa", "aaa", "aaa"),
                        "aaa: 4" }
        };
        int passed = 0;
        for (int i = 0; i < tests.length; i++) {
            List<String> input = (List<String>) tests[i][0];
            String expected = (String) tests[i][1];
            String result = wordFrequency(input);
            if (expected.equals(result)) {
                passed++;
                System.out.println("Test " + (i + 1) + " passed");
            } else {
                System.out.println("Test " + (i + 1) + " FAILED");
                System.out.println("Expected:\n" + expected);
                System.out.println("Got:\n" + result);
            }
        }
        System.out.println(passed + "/" + tests.length + " tests passed");
    }
}
