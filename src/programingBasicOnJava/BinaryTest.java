package programingBasicOnJava;

public class BinaryTest {
    public static void main(String[] args) {
        int num1 = 0B00000000000000000000000000000101;
        int num2 = num1*(-1);
        System.out.printf("%b + %b  = \n %b\n", num1, num2, num1 + num2);

        System.out.printf("%b",1);
    }
}
