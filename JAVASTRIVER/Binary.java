
import java.util.*;

class Binary{ 

    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No:");
        var n = sc.nextInt();

        System.out.println("Enter the Elements :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("Enter the Elements to be Searched :");
        var ele = sc.nextInt();
        int left=0;
        int right=a.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(ele==a[mid]){
                System.out.println("Element is Found at : " +(mid+1));
                break;
            }
            else if(ele>=a[mid]){
                left=mid+1;

            }
            else{
                right=mid-1;
            }
        }

        }

    }

