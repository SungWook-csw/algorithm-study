package CodeUp;

import java.util.Scanner;

public class C1162_210808 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Year = scan.nextInt();
        int Month = scan.nextInt();
        int Day = scan.nextInt();

        while (true) {
            int sum = 0;

            if (Year > 0 && Month > 0 && Day > 0) {
                sum = Year - Month + Day;
            }
            if (sum % 10 == 0) {
                System.out.println("대박");
                break;
            } else {
                System.out.println("그럭저럭");
                break;
            }
        }
    }
}