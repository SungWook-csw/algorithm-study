package BAEkJOON;

import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int 사이클수 = 0;
        int 정답 = N;

        while (true) {
            사이클수++;

            int 십의자리 = 정답 / 10;
            int 일의자리 = 정답 % 10;
            int 합 = (십의자리 + 일의자리) % 10;
            int 새로운수 = (일의자리 * 10) + 합;

            정답 = 새로운수;

            if (정답 == N) {
                break;
            }
         }
        System.out.println(사이클수);
    }
}
