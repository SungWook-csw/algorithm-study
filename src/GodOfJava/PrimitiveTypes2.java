package GodOfJava;

public class PrimitiveTypes2 {  // 기본 자료형
    public static void main(String[] args) {
        PrimitiveTypes2 types = new PrimitiveTypes2();
        types.checkOtherTypes();
    }

    public void checkOtherTypes() {
        short shortMax = 32767;
        short shortMin = -32768;
        int intMax = 2147483647;
        int intMin = -214748368;
        long longMax = 9223372036854775807L;
        long longMin = -9223372036854775808L;


        System.out.println("shortMax=" + shortMax);
        System.out.println("shortMin=" + shortMin);
        shortMax = (short) (shortMax + 1);
        shortMin = (short) (shortMin - 1);
        System.out.println("shortMin-1=" + shortMin);
        System.out.println("shortMax+1=" + shortMax);

        System.out.println("intMin=" + intMin);
        System.out.println("intMax=" + intMax);
        intMax = (int) (intMax + 1);
        intMin = (int) (intMin - 1);
        System.out.println("intMin-1=" + intMin);
        System.out.println("intMax+1=" + intMax);


        longMax = (long) (longMax + 1);
        System.out.println("longMax=" + longMax);
        System.out.println("longMax+1=" + longMax);
    }
}