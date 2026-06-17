import java.util.Scanner;
class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value for n:");
       var n=sc.nextInt();
       int i=2;
       while(i*i<=n){
        System.out.print(i*i+" ");
        i=i+2;      
    }
}
}