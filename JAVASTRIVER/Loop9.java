import java.util.Scanner;
public class Loop9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value for n:");
       var n=sc.nextInt();
       int i=2;
       int flag=1;
       while(i<=n){
        if(flag==1){
            System.out.print(i+" ");
            flag=0;
        }
        else{
            System.out.print("-"+i+" ");
            flag=1;
        }
     i=i+2;
    }   
    }
}

