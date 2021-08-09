package CodeUp;

import java.util.Scanner;

public class C1162_210808 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Y = scan.nextInt();
        int M = scan.nextInt();
        int D = scan.nextInt();

        int value = Y - M + D;
        int num = value % 10;

        if (num % 10 == 0) {
            System.out.println("대박");
        }else {
            System.out.println("그럭저럭");
        }
    }
}