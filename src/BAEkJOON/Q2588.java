package BAEkJOON;

import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int count = num2 % 100;

        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * (count / 10));
        System.out.println(num1 * (num2 / 100));
        System.out.println(num1 * num2);


    }
}
