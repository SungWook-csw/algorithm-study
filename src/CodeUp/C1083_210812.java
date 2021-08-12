package CodeUp;

import java.util.Scanner;

public class C1083_210812 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                System.out.println("X");
            } else {
                System.out.println(i);
            }
        }
    }
}
