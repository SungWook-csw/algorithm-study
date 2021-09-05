package Example;

import java.util.Arrays;

public class ex5_210905 {
    public static void main(String[] args) {
        int[] arr = {100, 95, 80, 70, 60};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // 배열의 주소값이 찍힌다.
        }
        System.out.println(Arrays.toString(arr));
    }
}
