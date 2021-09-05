package CodeUp;

import java.util.Scanner;

public class C1096_210905 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[19][19];
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int 행 = scan.nextInt();
            int 열 = scan.nextInt();
            arr[행 - 1][열 - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}