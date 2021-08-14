package CodeUp;

import java.util.Scanner;

public class C1411_210814 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length - 1; i++) {
            int num = scan.nextInt();
            arr[num - 1]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println(i + 1);
            }
        }
    }
}

