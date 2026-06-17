
import java.util.*;

public class Max {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        var v = sc.nextInt();
        for (int i = 0; i < v; i++) {
            System.out.println("Enter the element " + (i + 1));
            var n = sc.nextInt();
            list.add(n);
        }
        var max = list.get(0);
        System.out.println("The elements in the list are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println();
        System.out.println("Max: " + max);
    }
}
