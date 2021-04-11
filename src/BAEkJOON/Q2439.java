package BAEkJOON;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(" ");
            }
            num--;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
