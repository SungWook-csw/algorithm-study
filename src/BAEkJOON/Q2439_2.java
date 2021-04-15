package BAEkJOON;

import java.util.Scanner;

public class Q2439_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {  // 줄을 담당
            for (int j = 0; j < N-i; j++) { // 공백
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) { // 별
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
    }
}
