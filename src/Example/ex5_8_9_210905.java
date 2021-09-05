package Example;

public class ex5_8_9_210905 {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;

        int[] arr = {100, 88, 100, 100, 90};

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = sum / (double) arr.length;
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}

