package CodeUp;

import java.util.Scanner;

public class C1403_210805 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        int count = 0;
        int count1 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            count = arr[i];
        }
        for (int i : arr)
            System.out.println(i);

        for (int i = 0; i < arr.length; i++) {
            count1 = arr[i];
        }
        for (int i : arr)
            System.out.println(i);
    }
}