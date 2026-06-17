import java.util.Scanner;

public class Loop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 1) System.out.print("4 ");
        if (n >= 2) System.out.print("7 ");

        int a = 4;
        int b = 7;

        for (int i = 3; i <= n; i++) {
            int c = a + b - 1;
            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }
}