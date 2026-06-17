import java.util.*;

public class Hashing {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
       var n=sc.nextInt();
        int i=0;
        while(i<n){
            var ele=sc.next();
            list.add(ele);
            i++;
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
