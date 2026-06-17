
import java.util.*;

public class StackRev {

    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String n = sc.nextLine();
        for (char c : n.toCharArray()) {
            s.push(c);
        }

        for (int i = 0; i < n.length(); i++) {
            System.out.print(s.pop());
        }

    }
}
