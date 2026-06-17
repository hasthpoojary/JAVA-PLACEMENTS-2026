
public class Loop14 {

    public static void main(String[] args) {

        int count = 0;

        for (int num = 1;; num++) {

            if (num % 7 == 0
                    && num % 2 == 1
                    && num % 3 == 1
                    && num % 4 == 1
                    && num % 5 == 1
                    && num % 6 == 1) {

                count++;

                if (count == 1 || count == 2 || count == 4) {
                    System.out.println(count + "th required multiple = " + num);
                }

                if (count == 4) {
                    break;
                }
            }
        }
    }
}
