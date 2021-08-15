package CodeUp;

import java.util.Scanner;

public class C1430_210815_JS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[10000001];
        String 문제입력 = scanner.nextLine();
        for (String s : 문제입력.split(" ")) {
            int 문제 = Integer.parseInt(s);
            arr[문제]++;
        }

        int M = Integer.parseInt(scanner.nextLine());
        StringBuilder stringBuilder = new StringBuilder();
        String 질문입력 = scanner.nextLine();
        for (String s : 질문입력.split(" ")) {
            int 질문 = Integer.parseInt(s);
            if (arr[질문] > 0) {
                stringBuilder.append(1);
            } else {
                stringBuilder.append(0);
            }
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }
}
