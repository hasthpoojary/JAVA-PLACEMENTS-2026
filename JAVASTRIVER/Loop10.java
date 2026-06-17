import java.util.Scanner;
public class Loop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value for n:");
       var n=sc.nextInt();
       int i=2;
       while(i<=n){
        if(i==2||i==3||i==5||i==7)
            System.out.print(i+" ");
        if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0)
            System.out.print(i+" ");

        i++;
    }   
    }
}

