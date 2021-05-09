package BAEkJOON;

import java.util.Scanner;

public class Q2443 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = N; i >= 0; i--) {
            for (int j = 0; j < i * 2 - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();

            for (int j = N; j >= i; j--) {
                System.out.print(" ");
            }
        }

    }
}


