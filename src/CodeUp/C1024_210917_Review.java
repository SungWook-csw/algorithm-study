package CodeUp;

import java.util.Scanner;

public class C1024_210917_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            System.out.printf("\'%C'\'\n",str.charAt(i));
        }
    }
}
