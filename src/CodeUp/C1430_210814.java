package CodeUp;

import java.util.Scanner;

public class C1430_210814 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int M = scan.nextInt();
        int[] arr1 = new int[M];
        int[] 정답 = new int[M];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if (arr1[i] == arr[j]) {
                    정답[i] = 1;
                }
            }
        }
        for (int i : 정답) {
            System.out.print(i + " ");
        }
    }
}


