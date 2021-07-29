package CodeUp;

import java.util.Scanner;

public class C1154_210729_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        if (A > B) {
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}
