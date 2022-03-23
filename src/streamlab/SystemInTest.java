package streamlab;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("알파벳 하나를 쓰고 엔터를 누르세요");
        try {
            i = System.in.read(); //한바이트 읽기
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println((char)i);
    }
}
