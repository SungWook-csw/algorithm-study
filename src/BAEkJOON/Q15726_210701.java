package BAEkJOON;

import java.util.Scanner;

public class Q15726_210701 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextInt();
        double B = scan.nextInt();
        double C = scan.nextInt();

        double 곱하기기준 = A * B / C;
        double 나누기기준 = A / B * C;

        if (곱하기기준 > 나누기기준) {
            System.out.println((int) 곱하기기준);
        } else {
            System.out.println((int) 나누기기준);
        }
    }
}