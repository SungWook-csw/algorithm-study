package CodeUp;

import java.util.Scanner;

public class C1156_210805 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if (N % 2 == 1) {
            System.out.println("odd");
        } else if (N % 2 == 0) {
            System.out.println("even");
        }
    }
}
