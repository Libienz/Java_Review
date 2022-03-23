package streamlab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decorator {

    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
          //FileInputStream 으로 읽으면 바이트로 받아와서 깨지는데 그걸 리더로 변환해주는 보조스트림
          //try with resources 복습 이렇게 사용하면 오토클로저블이 구현되있는 객체의 경우 자동으로 닫아줌
          int i = 0;
          while((i = isr.read()) != -1) { //-1 == EOF
              System.out.println((char)i);
          }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
