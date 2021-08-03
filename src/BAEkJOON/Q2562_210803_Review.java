package BAEkJOON;

import java.util.Scanner;

public class Q2562_210803_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[9]; // 0부터 10개 칸

        int 최댓값 = 0;
        int 몇번째 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (최댓값 < arr[i]) {
                최댓값 = arr[i];
                몇번째 = i + 1;
            }
        }
        System.out.println(최댓값);
        System.out.println(몇번째);
    }
}

