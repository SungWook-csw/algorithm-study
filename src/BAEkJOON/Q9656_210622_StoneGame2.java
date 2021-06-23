package BAEkJOON;

import java.util.Scanner;

public class Q9656_210622_StoneGame2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if (N % 2 == 0) {
            System.out.println("SK");
        }else {
            System.out.println("CY");
        }
    }
}
