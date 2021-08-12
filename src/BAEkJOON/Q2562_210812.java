package BAEkJOON;

import java.util.Scanner;

public class Q2562_210812 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[9];

        int Max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (Max < arr[i]) {
                Max = arr[i];
                count = i + 1;
            }
        }
        System.out.println(Max);
        System.out.println(count);
    }
}
