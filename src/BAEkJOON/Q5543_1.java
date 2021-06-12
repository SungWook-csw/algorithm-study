package BAEkJOON;

import java.util.Scanner;

public class Q5543_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Burger = 2001;
        int Drink = 2001;

        // 버거
        for (int i = 0; i < 3; i++) {
            int Min = scan.nextInt();
            if (Min < Burger) { // 최소값
                Burger = Min;
            }
        }

        // 음료
        for (int i = 0; i < 2; i++) {
            int Max = scan.nextInt();
            if (Max < Drink) { // 최대값
                Drink = Max;
            }
        }
        System.out.println(Burger + Drink -50);

    }
}