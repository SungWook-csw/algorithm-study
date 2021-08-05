package CodeUp;

import java.util.Scanner;

public class C1157_210805 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double N = scan.nextDouble();

        if (N >=50 && N <= 60) {
            System.out.println("win");
        }else {
            System.out.println("lose");
        }
    }
}
