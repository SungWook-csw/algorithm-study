package CodeUp;

import java.util.Scanner;

public class C1025_210917 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char[] c = str.toCharArray();

        System.out.println("[" + c[0] + "0000]");
        System.out.println("[" + c[1] + "000]");
        System.out.println("[" + c[2] + "00]");
        System.out.println("[" + c[3] + "0]");
        System.out.println("[" + c[4] + "]");

    }
}