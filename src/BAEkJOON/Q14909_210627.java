package BAEkJOON;

import java.util.Scanner;

public class Q14909_210627 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int 상자 = 0;

        while (scan.hasNextInt()) {
            int num = scan.nextInt();

            if (0 < num) {
                상자++;
            }
        }
        System.out.println(상자);
    }
}
