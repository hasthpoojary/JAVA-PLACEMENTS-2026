
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveList {

    public static void main(String args[]) {

        List<String> words = new ArrayList<>(Arrays.asList("a", "code", "java", "is", "fun", "Hasth"));
        words.removeIf(s -> s.length() < 4);

        System.out.println(words);

    }
}
