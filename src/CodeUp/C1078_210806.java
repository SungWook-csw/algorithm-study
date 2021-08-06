package CodeUp;

import java.util.Scanner;

public class C1078_210806 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int storage = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                storage = storage + i;
            }
        }
        System.out.println(storage);
    }
}
