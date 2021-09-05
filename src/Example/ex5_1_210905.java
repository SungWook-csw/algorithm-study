package Example;

import java.util.Arrays;

public class ex5_1_210905 {
    public static void main(String[] args) {
        // index : 0~3-1, 0~2
        String[] strarr = {"가위", "바위", "보"};
        System.out.println(Arrays.toString(strarr));

        for (int i = 0; i < 10; i++) {
            int tmp = (int) (Math.random() * 3);
            System.out.println(strarr[tmp]);
        }
    }
}
