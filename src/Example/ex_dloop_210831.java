package Example;

import java.util.Scanner;

public class ex_dloop_210831 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100 + 1); // 1~100사이 정수 입력
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요.");
            input = scan.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수로 다시하세요");
            } else if (input < answer) {
                System.out.println("더 큰 수로 입력하세요");
            }
        } while (input!=answer);
        System.out.println("정답이다.");
    }
}
