package streamlab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {


    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(fis.read()); //한바이트씩 읽음
        } catch (IOException e) { //filenotfound가 io 하위
            e.printStackTrace();
        }
    }
}
