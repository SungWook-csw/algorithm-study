package CodeUp;

import java.util.Scanner;

public class C1019_210829 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String 문자[] = str.split("[.]");

        int y = Integer.parseInt(문자[0]);
        int m = Integer.parseInt(문자[1]);
        int d = Integer.parseInt(문자[2]);

        System.out.println(String.format("%04d.%02d.%02d", y, m, d));
    }
}