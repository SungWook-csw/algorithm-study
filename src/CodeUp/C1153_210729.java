package CodeUp;

import java.util.Scanner;

public class C1153_210729 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        if (A > B) {
            System.out.printf(">");
        } else if (B > A) {
            System.out.printf("<");
        } else if (A == B) {
            System.out.printf("=");
        }
    }
}
