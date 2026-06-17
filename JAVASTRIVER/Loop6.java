import java.util.Scanner;
public class Loop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value for n:");
       var n=sc.nextInt();
       int i=1,j=4,k=7;
       while(i<=n){
        System.out.print(i+" " );
        int t=i;
        i=j;
        j=k;
        k=t+j+i;

    }      
    }
}