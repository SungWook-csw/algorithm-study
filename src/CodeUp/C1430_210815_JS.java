package CodeUp;

import java.util.Scanner;

public class C1430_210815_JS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[10000001];
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            arr[num]++;
        }
        int M = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int 질문 = scanner.nextInt();
            if (arr[질문] > 0) {
                stringBuilder.append(1 + " ");
            } else {
                stringBuilder.append(0 + " ");
            }
        }
        System.out.println(stringBuilder);
    }
}
