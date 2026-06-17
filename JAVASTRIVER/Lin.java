
import java.util.*;

public class Lin {

    public static void main(String args[]) {
        var s = 0;
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        var v = sc.nextInt();
        for (int i = 0; i < v; i++) {
            System.out.println("Enter the element " + (i + 1));
            var n = sc.next();
            list.add(n);
        }
        System.out.println("Array : " + list);
        System.out.println("The elements in the list are: ");
        list.removeFirst();
        list.removeLast();
        System.out.println();
        System.out.println("Array : " + list);

    }
}
