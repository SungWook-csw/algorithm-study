package BAEkJOON;

import java.util.Scanner;

public class Q10871_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int x = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();

            if (num < x ) {
                System.out.println(num);
            } else {
                continue;
            }
        }
    }
}
