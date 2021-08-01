package BAEkJOON;

import java.util.Scanner;

public class Q2753_210801 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Y = scan.nextInt();

        if (Y % 4 == 0 && Y % 100 != 0 || Y % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}