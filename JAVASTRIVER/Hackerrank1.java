import java.util.Scanner;
public class Hackerrank1 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number : ");
        n = sc.nextInt();
        if(n%2!=0){
            System.out.println("Weird");
        } else {
            if(n >= 2 && n <= 5){
                System.out.println("Not Weird");
            } else if(n >= 6 && n <= 20){
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}
