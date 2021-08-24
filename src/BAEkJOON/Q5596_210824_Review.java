package BAEkJOON;

import java.util.Scanner;

public class Q5596_210824_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int 민국 = 0;
        int 만세 = 0;

        for (int i = 0; i < 4; i++) {
            int S = scan.nextInt(); // S = 민국
            민국 += S;
        }
        for (int i = 0; i < 4; i++) {
            int T = scan.nextInt(); // T = 만세
            만세 += T;
        }
        if (민국 > 만세) {
            System.out.println(민국);
        } else if (민국 >= 만세) {
            System.out.println(민국);
        } else {
            System.out.println(만세);
        }
    }
}




