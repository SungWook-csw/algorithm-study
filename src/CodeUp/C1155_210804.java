package CodeUp;

import java.util.Scanner;

public class C1155_210804 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if (N % 7 == 0) {
            System.out.println("multiple");
        } else {
            System.out.println("not multiple");
        }
    }
}
