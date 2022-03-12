package interfaceLab;
// 인터페이스 것 다 구현 안할 거면 abstract
public abstract class Calculator implements Calc{
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }


}
