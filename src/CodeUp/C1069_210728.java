package CodeUp;

import java.util.Scanner;

public class C1069_210728 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String N = scan.next();

        switch (N) {
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
                break;
        }
    }
}
