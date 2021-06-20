package BAEkJOON;
// 크냐 ? 다시 풀어보기
import java.util.Scanner;

public class Q4101_210620 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            int A = scan.nextInt();
            int B = scan.nextInt();

            if (A == 0 && B == 0) {
                break;
            } else if (A <= B) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
