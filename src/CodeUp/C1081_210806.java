package CodeUp;

import java.util.Scanner;

public class C1081_210806 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int storage = 0;
        int storage1 = 0;

        for (int i = 1; i <= num1; i++) {
            for (int j = 0; j < num2; j++) {
                storage = i;
                storage1 = j + 1;

                System.out.println(storage + " " + storage1);
            }
        }
    }
}
