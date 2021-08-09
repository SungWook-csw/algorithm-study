package BAEkJOON;

import java.util.Scanner;

public class Q11720_210809_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String 문자 = scan.next();

        int count = 0;
        for (int i = 0; i < N; i++) {
            count += 문자.charAt(i) - '0'; // 아스키코드
        }
        System.out.println(count);
    }
}
