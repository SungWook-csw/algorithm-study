package BAEkJOON;

import java.util.Arrays;
import java.util.Scanner;

public class Q1546_210815 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        double[] arr = new double[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        double 정답 = 0;
        for (int i = 0; i < arr.length; i++) {
            double 안녕 = arr[i] / arr[N - 1] * 100;
            정답 += 안녕;
        }
        System.out.println(정답 / N);
    }
}
