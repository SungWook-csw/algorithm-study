package CodeUp;

import java.util.Scanner;

public class C1081_210813 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int count = 0;
        int count1 = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                count = i;
                count1 = j;
                System.out.println(count + " " + count1);
            }
        }
    }
}
