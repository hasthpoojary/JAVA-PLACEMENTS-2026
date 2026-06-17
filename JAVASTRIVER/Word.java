import java.util.Scanner;

class Word {
    public static void main(String[] args) {
        String s1;
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        s1=sc.nextLine();  
        String arr[]=s1.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println(sb);

    }
}
