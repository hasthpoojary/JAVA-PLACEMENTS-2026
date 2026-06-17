import java.util.Scanner;
class Loop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value for n:");
       var n=sc.nextInt();
       int a=0,b=1,c=1;
       while(c<=n){
        System.out.print(c+" ");
        c=a+b;
        b=c;
        a=b;
    }
}
}