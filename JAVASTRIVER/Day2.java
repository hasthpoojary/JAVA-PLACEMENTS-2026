
class Day2{
    public static void main(String[] args) {
        int n=500,i;
        System.out.println();
        System.out.println("Printing first 100 Prime Numbers:");

         for(i=2;i<=n;i++){
            if(i==2||i==3||i==5||i==7){
                System.out.print(i+" ");
            }
            if(i%2==0||i%3==0||i%5==0||i%7==0){
                continue;
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}