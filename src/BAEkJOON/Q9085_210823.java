package BAEkJOON;

import java.util.Scanner;

public class Q9085_210823 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int num = scan.nextInt();
            int sum = 0;
            for (int j = 0; j < num; j++) {
                sum += scan.nextInt();
            }
            System.out.println(sum);
        }
    }
}