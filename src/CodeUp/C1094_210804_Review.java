package CodeUp;

import java.util.Scanner;

public class C1094_210804_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        int count = 0;

        for (int i = N - 1; i >= 0; i--) {
            arr[i] = scan.nextInt();
            count = arr[i];
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
