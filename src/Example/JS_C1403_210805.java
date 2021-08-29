package Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JS_C1403_210805 {
    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            arrlist.add(scan.nextInt());
        }
        for (int i = 0; i < 2; i++) {
            for (Integer arr : arrlist) {
                System.out.println(arr);
            }
        }
    }

}