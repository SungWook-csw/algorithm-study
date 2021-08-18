package CodeUp;

import java.util.Scanner;

public class C1082_210818 { // 16진수 구구단?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String N = scan.next();
        int num = Integer.parseInt(N,16);

        for (int i = 1; i < 16 ; i++) {
            System.out.format("%X*%X=%X\n",num,i,num*i);
        }
    }
}
