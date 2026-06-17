public class Pattern {
    public static void main(String[] args) {
        int n =0; 
        while(n<5){

        for (int i = 0; i < n; i++) {
            System.out.print((char)('A' + i) + " ");
        }

        for (int i = n - 2; i >= 0; i--) {
            System.out.print((char)('A' + i) + " ");
        }
        System.out.println();
        n++;
    }
}
}