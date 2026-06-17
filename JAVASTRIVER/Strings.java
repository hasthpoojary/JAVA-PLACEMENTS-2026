import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        String s1,s2="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        s1=sc.next();  
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);


    }
}
