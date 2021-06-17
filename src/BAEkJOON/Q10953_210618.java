package BAEkJOON;
// 210618 다시 풀어 보기
import java.util.Scanner;

public class Q10953_210618 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "A,B";

        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            String[] str2 = scan.next().split(",");
            int A = Integer.parseInt(str2[0]);
            int B = Integer.parseInt(str2[1]);

            System.out.println(A + B);
        }
    }
}
