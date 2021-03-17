package LifeCoding;
// 14.2 나의 앱 만들기
public class MyApp {
    public static void main(String[] args) {

        System.out.println("Value of supply : "+ 10000.0); // 공급가
        System.out.println("VAT : "+ (10000.0*0.1));
        System.out.println("Total : "+ (10000.0 + 10000.0*0.1));
        System.out.println("Expense : "+ (10000.0*0.3));
        System.out.println("Income : "+ (10000.0 - 10000.0*0.3));
        System.out.println("Dividend 1 : "+(10000.0 - 10000.0*0.3) * 0.5);
        System.out.println("Dividend 2 : "+(10000.0 - 10000.0*0.3) * 0.3);
        System.out.println("Dividend 3 : "+(10000.0 - 10000.0*0.3) * 0.2);

    }
}
