package GodOfJava;

public class OperatorMultipleDivision {
    public static void main(String[] args) {
        OperatorMultipleDivision sample = new OperatorMultipleDivision();
        sample.divisionInt2();
    }

/*    public void MultipleDivision() { // 곱하기 / 나누기
        int intValue1 = 5;
        int intValue2 = 10;

        int result = intValue1 * intValue2;
        System.out.println(result);
        System.out.println(result);
        result = intValue2 / intValue1; */

/*    public void divisionInt() {  //나누기 결과 값 0 일 때
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 / intValue2;
        System.out.println(result); */

    public void divisionInt2(){ // 나누기 결과를 0.5인 실수로 바꿀때
        double doubleValue1=5;
        double doubleValue2=10;
        double result=doubleValue1/doubleValue2;
        System.out.println(result);
    }
}
