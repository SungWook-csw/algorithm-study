package CodeUp;

import java.util.Scanner;

public class C1023_210906 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String[] num = str.split("[.]");

        System.out.println(num[0]);
        System.out.println(num[1]);
        // .을 기준으로 0 - 1 로 나눈다.
    }
}