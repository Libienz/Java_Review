package generics;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
        printer.setMaterial(new Powder());
        Powder powder = printer.getMaterial();
        System.out.println(printer);
        //모든 자료형을 사용하고 싶으면 오브젝트 사용하시오
        //업캐스팅이 이루어지는데 다시 받아올 때 다운캐스팅이 필요하다

        ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>();
        printer2.setMaterial(new Plastic());
        Plastic plastic = printer2.getMaterial();
        System.out.println(printer2);

        //제너릭 프로그래밍 할 때 <T>이렇게 하면 오브젝트 클래스로 일단 받아들여서 실제로
        //들어오면 안되는 클래스들이 들어올 수가 있음
        //그럴 때 좋은 방법은 상위클래스를 하나 만드는 것

    }
}
