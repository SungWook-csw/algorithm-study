package CodeUp;

import java.util.Scanner;

public class C1402_210814 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

