package CodeUp;

import java.util.Scanner;

public class C1024_210916 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int num = str.length();

        for (int i = 0; i < num; i++) {
            System.out.printf("\'%c\'\n",str.charAt(i));
        }
    }
}
