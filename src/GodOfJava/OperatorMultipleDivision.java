package GodOfJava;

public class OperatorMultipleDivision {
    public static void main(String[] args) {
        OperatorMultipleDivision sample = new OperatorMultipleDivision();
        sample.MultipleDivision();
    }

    public void MultipleDivision() {
        int intValue1 = 5;
        int intValue2 = 10;

        int result = intValue1 * intValue2;
        System.out.println(result);
        result = intValue2 / intValue1;
        System.out.println(result);
    }
}
