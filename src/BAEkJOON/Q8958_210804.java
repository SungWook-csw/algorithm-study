package BAEkJOON;

import java.util.Scanner;

public class Q8958_210804 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            String 문자 = scan.next();
            char[] arr = new char[문자.length()];

            int count = 1;
            int value = 0;

            for (int j = 0; j < arr.length; j++) {
                arr[j] = 문자.charAt(j);
                if (arr[j] == 'X') {
                    count = 1;
                    continue;
                }
                value += count++;
            }
            System.out.println(value);
        }
    }
}
