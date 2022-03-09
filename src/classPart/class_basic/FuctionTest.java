package classPart.class_basic;

public class FuctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        System.out.printf("%d\n",sum(num1,num2));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    // stack : 함수가 사용하는 메모리
    // 지역변수들이 terminate 된다는 것
    // 함수를 쓴다는 것은 재사용성 올리기 위해서
    // 기능 분리!
}
