package interfaceLab;
//상수와 추상메소드만 있는 ....
public interface Calc {

    public static final double PI = 3.14; //public static final쓰지 않아도
    int ERROR = -999999999; //자동으로 얘네는 상수로 취급함!

    public abstract int add(int num1, int num2); // public abstract 생략가능
    int substract(int num1, int num2); //인터페이스 안이라 이미 추상메소드임을 알고 있
    int times(int num1, int num2);
    int divide(int num1, int num2);
    default void description() { //디폴트도 당연히 오버라이드 가능
        System.out.println("정수 계산기를 구현합니다.");
    }
    static int total(int[] arr) { //생성없이 Calc.total이런식으로 쓸수 있음
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }
}
