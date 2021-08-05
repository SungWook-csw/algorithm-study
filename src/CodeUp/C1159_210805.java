package CodeUp;

import java.util.Scanner;

public class C1159_210805 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if (N % 6 == 0) {
            System.out.println("win");
        } else if (N >= 50 && N <= 70) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}
