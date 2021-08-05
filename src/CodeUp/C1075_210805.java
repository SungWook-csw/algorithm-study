package CodeUp;

import java.util.Scanner;

public class C1075_210805 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(N-i);
        }
    }
}

