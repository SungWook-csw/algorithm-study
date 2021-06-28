package CodeUp;

import java.util.Scanner;

public class C1152_210628 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num < 10) {
            System.out.println("small");
        }else {
            System.out.println("big");
        }
    }
}
