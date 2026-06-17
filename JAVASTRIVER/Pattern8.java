
import java.util.*;

public class Pattern8 {

    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count % 2 == 0) {
                    System.out.print(" " + (count * count));
                    count++;
                } else {
                    System.out.print(" -" + (count * count));
                    count++;
                }
            }
            System.out.println();
        }
        count = 1;

    }
}
