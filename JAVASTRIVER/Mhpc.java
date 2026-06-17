import java.util.Scanner;
public class Mhpc {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    var n=3;
    int a[][]=new int[n][n];
    int avg[]=new int[n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.println("Enter the time of Trainee "+(i+1)+" in "+(j+1)+" round :");
            a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                avg[i]=avg[i]+a[i][j];;
            }
            avg[i]=avg[i]/n;
        }
        
        for(int i=0;i<n;i++){
            if(avg[i]>70){
                System.out.println("Trainee Number :"+(i+1));
                }
        }
    }
}
