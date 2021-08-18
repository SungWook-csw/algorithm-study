package CodeUp;

import java.util.Scanner;

public class C1088_210818 { // 3의 배수는 통과?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
