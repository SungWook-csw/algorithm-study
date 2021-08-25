package BAEkJOON;

import java.util.Scanner;

public class Q8958_210825_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            String str = scan.next();
            char[] arr = new char[str.length()];

            int count = 0;
            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                arr[j] = str.charAt(j);

                if (arr[j] == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
