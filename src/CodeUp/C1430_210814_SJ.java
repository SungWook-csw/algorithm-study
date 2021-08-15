package CodeUp;

import java.util.Scanner;

public class C1430_210814_SJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[10000000];

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            arr[num]++;
        }

        int M = scanner.nextInt();

        int[] 정답 = new int[M];

        for (int i = 0; i < M; i++) {
            int num = scanner.nextInt();
            if (arr[num] >= 1) {
                정답[i] = 1;
            } else {
                정답[i] = 0;
            }
        }

        for (int i = 0; i < M; i++) {
            System.out.print(정답[i] + " ");
        }

    }
}
