package BAEkJOON;

import java.util.Scanner;

public class Q2577_210802 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int 곱한값 = A * B * C;

        int[] arr = new int[10];

        while (곱한값 > 0) {
            int sum = 곱한값 % 10;
            곱한값 /= 10;
            arr[sum]++;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
