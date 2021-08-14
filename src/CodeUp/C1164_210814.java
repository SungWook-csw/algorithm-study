package CodeUp;

import java.util.Scanner;

public class C1164_210814 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        if (A <= 170) {
            System.out.println("CRASH");
        } else if (B <= 170) {
            System.out.println("CRASH");
        } else if (C <= 170) {
            System.out.println("CRASH");
        } else {
            System.out.println("PASS");
        }
    }
}

