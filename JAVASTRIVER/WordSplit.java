
public class WordSplit {

    public static void main(String args[]) {
        var str = "Hello from Bantwal";
        String words[] = str.split(" ");
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            System.out.print(sb + " " + sb.length() + " ");
        }

    }
}
