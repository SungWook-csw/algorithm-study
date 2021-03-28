package BAEkJOON;

import java.util.Scanner;

public class Q14681 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int X = Scan.nextInt();
        int Y = Scan.nextInt();

        if (X > 0 && Y > 0) {
            System.out.println(1);
        } else if (X > 0 && Y < 0) {
            System.out.println(4);
        } else if (X < 0 && Y > 0) {
            System.out.println(2);
        } else System.out.println(3);

    }
}
