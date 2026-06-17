
import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(-val + " "); 
            }else {
                System.out.print(val + " ");
            }

            val += 4;
        }
    }
}
