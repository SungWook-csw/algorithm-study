package CodeUp;

import java.util.Scanner;

public class C1165_210818 { // 축구의 신
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int G = scan.nextInt();

        for (int i = T; i < 90; i = i + 5) {
            G++;
        }
        System.out.println(G);
    }
}
