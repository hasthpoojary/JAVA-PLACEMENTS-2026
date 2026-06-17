
import java.util.*;

public class Inte {

    public static void main(String args[]) {
        var s = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        var v = sc.nextInt();
        for (int i = 0; i < v; i++) {
            System.out.println("Enter the element " + (i + 1));
            var n = sc.nextInt();
            list.add(n);
        }
        System.out.println("The elements in the list are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
            s = s + list.get(i);
        }
        System.out.println();
        System.out.println("Sum: " + s);

    }
}
