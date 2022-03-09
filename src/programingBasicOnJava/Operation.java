package programingBasicOnJava;

public class Operation {
    public static void main (String[] args) {
        int age = 27; //우선순위 가장 낮은 대입 연산자

        int num = 10;
        int num2 = -num; // -10 --> 부호연산자
        num++; //문장이 실행되기 전? 후? 증감연산자
        System.out.println(3<5); //관계연산자의 그리고 논리연산자 결과는 불린타입
        //sce 숏컷이밸류에이션 논리연산에서 앞의 것만 판단해도 전체값이 평가 가능한 경우
        int num1 = 10;
        int i = 2;
        boolean value = ((num1 = num1 + 10) < 10)&&((i = i+2) > 10);
        //뒤에것이 실행되지 않는다. sce



    }
}
