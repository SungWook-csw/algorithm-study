package Example;

public class ex5_21_2dimensionalArray_210905 {
    public static void main(String[] args) {
        int[][] arr = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("arr[%d][%d]=%d%n", i, j, arr[i][j]);
                sum += arr[i][j];
            }
        }
        System.out.println("sum=" + sum);
    }
}
