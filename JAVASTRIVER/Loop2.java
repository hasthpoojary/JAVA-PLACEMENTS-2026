import java.util.Scanner;
class Loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value for n:");
       var n=sc.nextInt();
       int i=1;
       while((i+2)<=n){
        System.out.print(i+" ");
        i=i+2;      
    }
}
}