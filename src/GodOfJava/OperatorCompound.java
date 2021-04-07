package GodOfJava;

public class OperatorCompound {
    public static void main(String[] args) {
        OperatorCompound scan = new OperatorCompound();
        scan.compound();
    }

/*    public void compound() {  // 5장. 연습문제 내가 푼 코드
        int intValue1 = 10;
        int intValue2 = 5;
        int reslut = intValue1 += intValue2;
        System.out.println(reslut);
        reslut = intValue1 -= intValue2;
        System.out.println(reslut);
        reslut = intValue1 *= intValue2;
        System.out.println(reslut);
        reslut = intValue1 /= intValue2;
        System.out.println(reslut);
        reslut = intValue1 %= intValue2;
        System.out.println(reslut); */

    public void compound() {  // 복합 대입 연산자 -> 기존 값에 우측 항의 값을 더하는 코드
        int intValue1 = 10;
        intValue1 += 5;
        System.out.println(intValue1);
        intValue1 -= 5;
        System.out.println(intValue1);
        intValue1 *= 5;
        System.out.println(intValue1);
        intValue1 /= 5;
        System.out.println(intValue1);
        intValue1 %= 5;
        System.out.println(intValue1);
    }
}
