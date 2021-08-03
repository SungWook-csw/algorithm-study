package CodeUp;

import java.util.Scanner;

public class C1093_210803 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[23];

        int count = 0;

        for (int i = 0; i < N; i++) {
            count = scan.nextInt();
            arr[count - 1]++;

        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}


