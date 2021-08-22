package BAEkJOON;

import java.util.Scanner;

public class Q2576_210822 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[7];

        int storage = 0;
        int count = 0;
        int min = 100;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] % 2 == 1) {
                storage += arr[i];
                if (arr[i] < min) {
                    min = arr[i];
                }
            } else {
                count++;
            }
        }
        if (count == 7) {
            System.out.println(-1);
        } else {
            System.out.println(storage);
            System.out.println(min);
        }
    }
}

