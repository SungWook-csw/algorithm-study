package BAEkJOON;

import java.util.Scanner;

public class Q2493_1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int N = Scan.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}