package BAEkJOON;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean 성욱 = true;

        while (성욱) {
            int A = scan.nextInt();
            int B = scan.nextInt();

            if (A == 0 && B == 0) {
                성욱 = false;
            } else {
                System.out.println(A + B);
            }

        }
    }
}

