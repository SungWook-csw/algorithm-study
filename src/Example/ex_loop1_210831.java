package Example;

public class ex_loop1_210831 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        while (sum <= 100) {
            System.out.printf("%d - %d%n", i, sum);
            sum += ++i;
        }
    }
}
