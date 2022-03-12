package interfaceLab;

public class CalcTest {
    public static void main(String[] args) {
        int num1  = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc(); //컴플릿까지 구현된 모든 메소드 사용가능능
        System.out.println(calc.add(num1,num2));// calc.add(num1,num2);
        //인스턴스에 상관없이 타입에 종속되서 참조할 수 있는 기능은 타입 종속적
        //다중 구현 가능
    }
}
