package BAEkJOON;

import java.util.Scanner;

public class Q5073_210802 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();

            if (A == 0 && B == 0 && C == 0) {
                break;
            }

            int 최대값 = 0;

            if (A >= B && A >= C) {
                최대값 = A;
            } else if (B >= A && B >= C) {
                최대값 = B;
            } else {
                최대값 = C;
            }

            int num = 최대값 - (A + B + C);

            if (최대값 >= Math.abs(num)) { // 음수를 양수로 바꿔주는 타입
                System.out.println("Invalid");
            } else if (A == B && B == C && A == C) {
                System.out.println("Equilateral");
            } else if (A == B || B == C || A == C) {
                System.out.println("Isosceles");
            } else if (A != B || B != C || A != C) {
                System.out.println("Scalene");
            }
        }
    }
}

