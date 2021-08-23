package CodeUp;

import java.util.Scanner;

public class C1405_210823 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int K = i;
            for (int j = 0; j < N; j++) {
                if (K == N)
                    K = 0;
                    System.out.printf("%d ", arr[K]);
                    K++;
                }
                System.out.println();
            }
        }
    }
