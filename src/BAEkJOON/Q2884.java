package BAEkJOON;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Hour = scan.nextInt();
        int Minute = scan.nextInt();

        if (Minute < 45) {
            Hour--;
            Minute = 60 - (45 - Minute);

            if (Hour < 0) {
                Hour = 23;
            }
            System.out.println(Hour + "" + Minute);
        } else {
            System.out.println(Hour + "" + (Minute - 45));
        }
    }
}
