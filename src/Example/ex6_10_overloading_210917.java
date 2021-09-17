package Example;

public class ex6_10_overloading_210917 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();

        System.out.println("mm.add(3, 3) 결과:" + mm.add(3, 3));
        System.out.println("mm.add(3L, 3) 결과:" + mm.add(3L, 3));
        System.out.println("mm.add(3, 3L) 결과:" + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3L) 결과:" + mm.add(3L, 3L));

    }
}

class MyMath3 {

    long add(int a, int b) {
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }

    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }

}

