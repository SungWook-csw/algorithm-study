package BAEkJOON;

import java.util.Scanner;

public class Q2441 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                System.out.print("*");
            }
            System.out.println();

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
        }
    }
}
