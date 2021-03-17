package LifeCoding;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
// 생활코딩 13.4 자바 문서 보는 법 - 인스턴스

public class InstanceApp {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 2");
        p2.close();

    }
}
