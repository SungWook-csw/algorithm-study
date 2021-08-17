package CodeUp;

import java.util.Scanner;

public class C1166_210817 { //윤년
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if (N % 4 == 0 && N % 100 != 0 || N % 400 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
