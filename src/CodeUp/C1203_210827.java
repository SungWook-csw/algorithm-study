package CodeUp;

import java.util.Scanner;

public class C1203_210827 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num <= 10) {
            System.out.println("정상");
        } else if (num <= 20) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
}
