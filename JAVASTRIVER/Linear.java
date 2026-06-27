import java.util.*;
class Linear{
    public static void main(String[] args) {
    int a[]=new int[10];
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the No:");
    var n=sc.nextInt();

    System.out.println("Enter the Elements :");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();

    }
    System.out.println("Enter the Elements to be Searched :");
    var ele=sc.nextInt();

    for(int i=0;i<n;i++){
        if(a[i]==ele){
            System.out.println("Element is Found at : " +(i+1));
        }

    }    
    
    }

}