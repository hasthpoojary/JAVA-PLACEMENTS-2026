
import java.util.*;

public class LinArr {

    public static void main(String args[]) {
        var s = 0;
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        var v = sc.nextInt();
        for (int i = 0; i < v; i++) {
            System.out.println("Enter the element " + (i + 1));
            var n = sc.nextInt();
            list.add(n);
        }
        System.out.println("LinkedList : " + list);
        ArrayList<Integer>arr = new ArrayList<Integer>(list);
        System.out.println();
        System.out.println("Array : " + arr);

    }
}
