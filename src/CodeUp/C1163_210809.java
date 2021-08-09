package CodeUp;

import java.util.Scanner;

public class C1163_210809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Y = scan.nextInt();
        int M = scan.nextInt();
        int D = scan.nextInt();

        int sum = Y + M + D;

        int value = sum / 100;

        if (value % 2 == 0) {
            System.out.println("대박");
        } else {
            System.out.println("그럭저럭");
        }
    }
}