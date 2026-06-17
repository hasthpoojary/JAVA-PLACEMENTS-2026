
import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c;
        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                c = a + b;
                b = c;
                a = b;
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
