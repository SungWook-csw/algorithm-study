package LifeCoding;

public class WhyMethod {
    public static void printTwoTimesA() {
        System.out.println("-");
        System.out.println("a");
        System.out.println("a");

    }

    public static void main(String[] args) {

        // 100000000
        printTwoTimesA(); //프린트 한다 A를 두번
        // 100000000
        printTwoTimesA();
        // 100000000
        printTwoTimesA();

    }
}
