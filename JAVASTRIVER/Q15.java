import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char ch : input.toCharArray()) {

            if (Character.isLetter(ch)) {
                stack.push(ch);
                queue.offer(ch);
            }
        }

        boolean palindrome = true;

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                palindrome = false;
                break;
            }
        }

        if (palindrome)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}