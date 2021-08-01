package BAEkJOON;

import java.util.Scanner;

public class Q5596_210801 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int 성준합 = 0;
        int 성욱합 = 0;

        for (int i = 0; i < 4; i++) {
            int 성준점수 = scan.nextInt();
            성준합 += 성준점수;
            // 성준합 = 성준합 + 성준점수;
        }

        for (int i = 0; i < 4; i++) {
            int 성욱점수 = scan.nextInt();
            성욱합 += 성욱점수;
        }


        if (성준합 > 성욱합) {
            System.out.println(성준합);
        } else if (성준합 < 성욱합) {
            System.out.println(성욱합);
        } else {
            System.out.println(성준합);
        }
    }
}
