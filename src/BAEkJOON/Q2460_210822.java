package BAEkJOON;

import java.util.Scanner;

public class Q2460_210822 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int max = 0;

        for (int i = 0; i < 10; i++) {
            int out = scan.nextInt();
            int in = scan.nextInt();

            sum = sum + in;
            sum = sum - out;

            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}