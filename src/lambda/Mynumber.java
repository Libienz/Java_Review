package lambda;

@FunctionalInterface
public interface Mynumber { //함수형 인터페이스
    int getMaxnumber(int num1, int num2);
    //int testNumber(); 함수형 인터페이스는 메소드를 하나만 사용해야 함 구현부에서
    //어느걸 구현한건지 헷갈리지 않도록
}
