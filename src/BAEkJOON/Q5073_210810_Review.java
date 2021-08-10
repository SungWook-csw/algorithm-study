package BAEkJOON;

import java.util.Scanner;

public class Q5073_210810_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();

            if (A == 0 && B == 0 && C == 0) {
                break;
            }
            int Max = 0;

            if (A >= B && A >= C) {
                Max = A;
            } else if (B >= A && B >= C) {
                Max = B;
            } else {
                Max = C;
            }
            int value = Max - (A + B + C);

            if (Max >= Math.abs(value)) {
                System.out.println("Invalid");
            } else if (A == B && B == C && A == C) {
                System.out.println("Equilateral");
            } else if (A == B || B == C || A == C) {
                System.out.println("Isosceles");
            } else if (A != B && B != C && A != C) {
                System.out.println("Scalene");
            }
        }
    }
}