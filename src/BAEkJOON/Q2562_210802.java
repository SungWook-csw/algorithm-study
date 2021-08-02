package BAEkJOON;

import java.util.Arrays;
import java.util.Scanner;

public class Q2562_210802 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[9];

        int 최대값 = 0;
        int 위치 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

            if (최대값 < arr[i]) {
                최대값 = arr[i];
                위치 = i + 1;
            }
        }
        System.out.println(최대값);
        System.out.println(위치);
    }
}


