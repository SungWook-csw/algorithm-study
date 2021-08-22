package CodeUp;

import java.util.Scanner;

public class C1089_210822 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int d = scan.nextInt();
        int n = scan.nextInt();

        int value = a;

        for (int i = 1; i < n; i++) {
            value = value + d;
            //value += d;
        }
        System.out.println(value);
    }
}


