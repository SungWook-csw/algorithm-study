package CodeUp;

import java.util.Scanner;

public class C1080_210810 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int value = 0;
        for (int i = 1; i <= num; i++) {
            value += i;
            if (value >= num) {
                System.out.println(i);
                break;
            }
        }
    }
}
