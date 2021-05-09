package BAEkJOON;

import java.util.Scanner;

public class Q2444 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int 저장소 = N * 2 - 1 - 2;

        for (int i = 1; i <= N - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 저장소; j++) {
                System.out.print("*");
            }
            System.out.println();
            저장소 = 저장소 - 2;
        }
    }
}
