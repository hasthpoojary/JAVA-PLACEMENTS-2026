
import java.util.*;

public class RemPos {

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
        var x = 0;
        System.out.println("Array : " + list);
        while(x==0){
        System.out.println("Insert (1) or Delete (2) : ");
        var ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Position : ");
            var s = sc.nextInt();
            System.out.println("Element : ");
            var e = sc.nextInt();
            list.add(s, e);
        } else if (ch == 2) {
            System.out.println("Position : ");
            var s = sc.nextInt();
            list.remove(s);
        } else if (ch == 3) {
            x = 1;
        } else {
            System.out.println("Invalid Choice");
            
        }
        System.out.println();
        System.out.println("Array : " + list);

    }
}
}
