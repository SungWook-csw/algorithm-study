package Example;

public class ex5_stringclass_210905 {
    public static void main(String[] args) {
        //            01234
        String str = "ABCDE";

        char ch = str.charAt(4);
        String str2 = str.substring(1,4);
        String str3 = str.substring(1);

        System.out.println(ch);
        System.out.println(str2); // BCD, 맨뒤에 to는 포함 X
        System.out.println(str3); // 1부터 뒤에 다 출력 leght랑 같은 의미
    }
}
