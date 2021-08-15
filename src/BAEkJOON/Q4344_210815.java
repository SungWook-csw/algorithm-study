package BAEkJOON;

import java.util.Scanner;

public class Q4344_210815 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int 전체 = scan.nextInt();

        for (int i = 0; i < 전체; i++) {
            double 평균 = 0;
            double 점수합 = 0;

            int 평균이상 = 0;
            int T = scan.nextInt();
            int[] arr1 = new int[T];

            for (int j = 0; j < T; j++) {
                int num = scan.nextInt();
                arr1[j] = num;
                점수합 += num;
            }
            평균 = 점수합 / T;

            for (int 점수 : arr1) {
                if (평균 < 점수) {
                    평균이상++;
                }
            }
            double 정답 = (double) 평균이상 / T * 100;
            System.out.println(String.format("%.3f", 정답) + "%");
        }
    }
}