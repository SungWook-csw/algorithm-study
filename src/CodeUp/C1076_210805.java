package CodeUp;

import java.util.Scanner;

public class C1076_210805 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char value = scan.next().charAt(0);
        char a = 'a';

        while (a <= value) {
            System.out.println(a + "");
            a++;
        }
    }
}
