package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class C1167_210821 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
