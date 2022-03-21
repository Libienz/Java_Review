package lambda;
interface PrintString {
    void showString(String str);
}
public class LambdaTest {
    public static void main(String[] args) {
        PrintString lambdaPrint = str -> System.out.println(str);
        lambdaPrint.showString("test");
    }

    public static void showMyString(PrintString lambda) {
        lambda.showString("test2");
    }
}
