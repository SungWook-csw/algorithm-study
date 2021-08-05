package CodeUp;

import java.util.Scanner;

public class C1158_210805 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if (N >= 60 && N <= 70) {
            System.out.println("win");
        } else if (N >= 30 && N <= 40) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}
