import java.util.Scanner;

public class Hackerrank2 {
    public static void main(String[] args) {
        String s1,s2,s3;
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string 1:");
        s1=sc.next();
        System.out.println("Enter a string 2:");
        s2=sc.next();
        System.out.println("Enter a string 3:");
        s3=sc.next();
        System.out.println("Enter a Integer 1:");
        a=sc.nextInt();
        System.out.println("Enter a Integer 2:");
        b=sc.nextInt();
        System.out.println("Enter a Integer 3:");
        c=sc.nextInt();
        System.out.println("================================");
        System.out.printf("%-15s%03d\n",s1,a);
        System.out.printf("%-15s%03d\n",s2,b);
        System.out.printf("%-15s%03d\n",s3,c);
        System.out.println("================================");
    }
}
