package LifeCoding;

public class Handing_Strings {
    public static void main (String [] args) {
        System.out.println("Hello World"); // 문자가 모여있는 것 => 문자열(String)
// 작은 따옴표 => 특수한 데이터 타입, 한 글자 사용
        System.out.println('H'); // Charater 한글자를 표현하는 타입
        System.out.println("H"); // 큰 따옴표 문자열

        System.out.println("Hello"
                + "World");

        // 역슬래 쉬 => 줄바꿈 New Line
        System.out.println("Hello \nWorld");

        // 일시적으로 해방시키는 것 escape
        System.out.println("Hello \"World\""); // Hello "World"
        System.out.println("Hello \"World\""); // Hello "World"

    }
}
