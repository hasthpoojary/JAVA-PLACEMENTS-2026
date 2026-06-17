import java.util.Scanner;
class Loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value for n:");
       var n=sc.nextInt();
       int i=1,count=1;
       while(i*i<=n){
        if(count!=3){
        System.out.print((i*i)+" ");
        i++;      
        count++;
        }
        else{
            System.out.print((i*i)+" ");
            i=i+2;
            count=1;
        }
    }
}
}