
public class Merge {

    public static void main(String[] args) {
        int[] a1 = {5, 4, 3, 2, 1};
        int[] a2 = {10, 9, 8, 7, 6};
        for (int h : a1) {
            System.out.print(h + " ");
        }
        System.out.println();
        for (int h : a2) {
            System.out.print(h + " ");
        }
        System.out.println();

        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = 0; j < a1.length - i - 1; j++) {
                if (a1[j] > a1[j + 1]) {
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a2.length - 1; i++) {
            for (int j = 0; j < a2.length - i - 1; j++) {
                if (a2[j] > a2[j + 1]) {
                    int temp = a2[j];
                    a2[j] = a2[j + 1];
                    a2[j + 1] = temp;
                }
            }
        }
        int i;
        int a3[] = new int[20];

        for (i = 0; i <= a1.length - 1; i++) {
            a3[i] = a1[i];
        }
        for (int j = 0; j <= a2.length - 1; j++) {
            a3[i + j] = a2[j];
        }
        for (int h : a3) {
            if (h != 0) {
                System.out.print(h + " ");
            }
        }
        System.out.println();

        for (int h : a1) {
            System.out.print(h + " ");
        }
        System.out.println();
        for (int h : a2) {
            System.out.print(h + " ");
        }
        System.out.println();
        for (int h : a3) {
            if (h != 0) {
                System.out.print(h + " ");
            }
        }
    }

}
