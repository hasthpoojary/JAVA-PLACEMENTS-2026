
import java.util.*;

public class HotPotato {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        System.out.println("Enter the no :");
        var n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            var v = sc.nextInt();
            q.add(v);
        }
        for (int i = 0; i <= q.size(); i++) {
            System.out.println("Remove:");
            var k = sc.nextInt();
            while(q.peek() != k) {
                q.offer(q.poll());
            }
                q.remove(k);

            System.out.println(q);
        }
        System.out.println(q);

    }
}
