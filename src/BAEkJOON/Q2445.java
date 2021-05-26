package BAEkJOON;

import java.util.Scanner;

public class Q2445 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int 저장소 = N * 2;
        int 공백저장소 = N * 2 - 2;

        for (int i = 1; i <= N - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 공백저장소; j++) {
                System.out.print(" ");
            }
            공백저장소 = 공백저장소 - 2;

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




        공백저장소 = 공백저장소 + 2;
        for (int i = 0; i < 저장소; i++) {
            System.out.print("*");
        }
        System.out.println();


        for (int i = 1; i <= N - 1; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 공백저장소; j++) {
                System.out.print(" ");
            }


            공백저장소 = 공백저장소 + 2;

            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
