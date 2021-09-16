package Example;

public class ex6_method_210916 {
    public static void main(String[] args) {
        MyMath mm = new MyMath(); // 2. 객체 생성
        long result1 = mm.add(5L, 3L); // 객체의 메소드 호출
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add(5L,3L) = " + result1);
        System.out.println("subtract(5L,3L) = " + result2);
        System.out.println("multiply(5L,3L) = " + result3);
        System.out.println("divide(5L,3L) = " + result4);
    }
}

class MyMath { // 1. MyMath 클래스 먼저 작성 (메서드 작성)
    long add(long a, long b) {
        long result = a + b;
        return result;
        // return a + b; 위의 두줄을 이와 같이 한줄로 할 수 있다.
    }
        long subtract (long a, long b) { return a - b;}
        long multiply (long a, long b) { return a * b;}
        double divide (long a, long b) {
        return a / b;

    }
}
