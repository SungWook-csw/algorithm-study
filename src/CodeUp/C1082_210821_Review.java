package CodeUp;

import java.util.Scanner;

public class C1082_210821_Review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String N = scan.next();
        int count = Integer.parseInt(N, 16);

        for (int i = 1; i < 16; i++) {
            System.out.format("%X*%X=%X\n",count,i,count*i);
        }
    }
}
