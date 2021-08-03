package BAEkJOON;

import java.util.Scanner;

public class Q2577_210803_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int 곱한값 = A * B * C;

        int[] arr = new int[10];
        while (곱한값 > 0) {
            int 일의자리 = 곱한값 % 10;
            곱한값 = 곱한값 / 10; // 곱한값 /= 10; 으로 사용할 수 있다.
            arr[일의자리]++;
        }
        for (int i : arr) { // i를 arr 이라는 타입에 각자 처음부터 끝까지 순차적으로 수행한다.
            System.out.println(i);
        }
    }
}
