import java.util.Scanner;
public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value for n:");
       var n=sc.nextInt();
       int i=1;
       while(i<=n){
        System.out.print(i+" ");
        i++;
    }      
    }
}