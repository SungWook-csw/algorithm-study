package BAEkJOON;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= 9; i++) { // 종료 조건 : 9까지는 반복해라
            System.out.println(N + "*" + i + "=" + N*i ); // 공백 주의
        }

    }

}

