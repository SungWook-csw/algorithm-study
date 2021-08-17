package CodeUp;

import java.util.Scanner;

public class C1087_210817 { //반복하면서 반복횟수 만큼 그 수를 더하기
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int value = 0;

        for (int i = 1; i <= N; i++) {
            value += i;
            if (value >= N) {
                break;
            }
        }
        System.out.println(value);
    }
}
