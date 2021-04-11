package BAEkJOON;

import java.util.Scanner;

public class Q2440 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) { // 행의 개수
            for (int j = 1 ; j <= n-i+1; j++) { // 별 또는 공백
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
