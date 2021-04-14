package BAEkJOON;

import java.util.Scanner;

public class Q2884_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Hour = scan.nextInt();
        int Minute = scan.nextInt();

        if (Minute >= 45) {
            System.out.println(Hour + " " + (Minute - 45));
        } else {
            Minute = 60 + (Minute -45);
            if (--Hour == -1){
                Hour=23;
            }
            System.out.println(Hour+ " "+Minute);
        }
    }
}
