package BAEkJOON;

import java.util.Scanner;

public class Q11720_210802 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String a = scan.next();

        int 저장소 = 0;

        for (int i = 0; i < N; i++) {
            저장소 += a.charAt(i) - '0';
            // 하나씩 쪼개서 사용한다.
            // 저장소 = 저장소 + num 줄임말이다
        }
        System.out.println(저장소);
    }
}
