package BAEkJOON;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818_210811 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[arr.length-1]);
    }
}
