package BAEkJOON;

import java.util.Scanner;

public class Q2839_210803_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int count = 0;

        while (true) {
            if (N % 5 == 0) {
                count = count + N / 5; // count += N / 5; 로 바꿔 사용할 수 있다.
                System.out.println(count);
                break;
            } else {
                N = N - 3;
                count++;
            }
            if (N < 0) {
                System.out.println(-1);
                break;
            }
        }
    }
}