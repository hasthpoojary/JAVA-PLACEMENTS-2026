
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        while (queue.size() < n) {
            System.out.println("Enter the value: ");
            int a = sc.nextInt();
            queue.add(a);
        }
        System.out.println(queue);

        System.out.println(queue);
        while (queue.size() < n) {
            System.out.println(queue.remove());
        }
    }
}
