import java.util.*;
class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        var str=sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb=sb.reverse();
        System.out.println("Reverse : "+sb);
        var s=sb.toString();
        System.out.println("Reverse : "+s);
        

    }
}