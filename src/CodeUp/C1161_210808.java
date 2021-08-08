package CodeUp;

import java.util.Scanner;

public class C1161_210808 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        if (A % 2 == 0 && B % 2 == 0) {
            System.out.println("짝수+짝수=짝수");
        } else if (A % 2 == 1 && B % 2 == 0) {
            System.out.println("홀수+짝수=홀수");
        } else if (A % 2 == 0 && B % 2 == 1) {
            System.out.println("짝수+홀수=홀수");
        } else {
            System.out.println("홀수+홀수=짝수");
        }
    }
}