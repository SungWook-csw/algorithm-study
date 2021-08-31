package Example;

import java.util.Scanner;

public class ex_wloop2_210831 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.println("숫자를 입력하세요.");

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        num = Integer.parseInt(str);

        while (num != 0) {
            sum += num % 10;
            System.out.printf("sum=%3d num=%d%n", sum, num);
            num /= 10;
        }
        System.out.println("각 자리수의 합:"+sum);
    }
}
