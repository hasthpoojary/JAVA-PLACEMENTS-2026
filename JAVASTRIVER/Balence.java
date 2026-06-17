
import java.util.*;

public class Balence {

    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Brackets: ");
        String n = sc.next();
        for (char c : n.toCharArray()) {
            s.push(c);
        }
        Stack<Character> x = new Stack<Character>();
        for (char c : n.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                x.push(c);
            } else if (c == ')' && !x.isEmpty() && x.peek() == '(') {
                x.pop();
            } else if (c == '}' && !x.isEmpty() && x.peek() == '{') {
                x.pop();
            } else if (c == ']' && !x.isEmpty() && x.peek() == '[') {
                x.pop();
            } else {
                System.out.println("Not Balanced");
                return;
            }
        }
        System.out.println("Balenced");
    }
}
