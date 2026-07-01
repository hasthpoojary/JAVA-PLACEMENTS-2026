
import java.util.Scanner;

class Random {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10) + 1;
        Scanner sc = new Scanner(System.in);
        var i = 5;
        while (i > 0) {
            System.out.println("Guess the Number u have only " + i + " chance : ");
            var e = sc.nextInt();
            if (e == n) {
                System.out.println("Guessed is Right!!!");
                break;
            } else {
                i--;
                System.out.println("Wrong Guess!!!");
            }
        }
        System.out.println("Thank U!!!");
    }
}
