package CodeUp;

import java.util.Scanner;

public class C1403_210805 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            for (int j : arr)
                System.out.println(j);
        }
    }
}

