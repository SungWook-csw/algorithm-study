package BAEkJOON;

import java.util.Scanner;

public class Q2010_210804 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 멀티탭 개수

        int plug = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int tap = scan.nextInt(); //구멍 개수
            sum = tap + tap;
            plug += tap;
        }
        System.out.println(plug-(N-1));
    }
}



