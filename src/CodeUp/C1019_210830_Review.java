package CodeUp;

import java.util.Scanner;

public class C1019_210830_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String [] num = str.split("\\."); // .과 같은 예약어는 \\ or [] 을 넣어 사용한다.

        int Y = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);
        int D = Integer.parseInt(num[2]);

        System.out.printf(String.format("%04d.%02d.%02d", Y, M, D));
    }
}
