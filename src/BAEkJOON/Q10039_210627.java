package BAEkJOON;

import java.util.Scanner;

public class Q10039_210627 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int 합 = 0;

        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();

            if (40 > num) {
                num = 40;
                합 += num;  // 합 = 합 + num; 변형

            } else {
                합 += num;
            }
        }
        System.out.println(합 / 5);
    }
}