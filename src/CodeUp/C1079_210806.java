package CodeUp;

import java.util.Scanner;

public class C1079_210806 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            char 문자 = scan.next().charAt(0);
            if (문자 == 'q') {
                System.out.println(문자);
                break;
            }
            System.out.println(문자);
        }
    }
}
