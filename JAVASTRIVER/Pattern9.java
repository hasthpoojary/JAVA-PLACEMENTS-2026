import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long fact = 1;
        int num = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                fact *= num;
                System.out.print(fact + " ");
                num++;
            }
            System.out.println();
        }
    }
}