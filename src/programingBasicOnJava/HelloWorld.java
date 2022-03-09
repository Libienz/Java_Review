package programingBasicOnJava;

// jdk java development kit 라이브러리
// jre java runtime enviroment jvm
// Class 이름 대문자!
// .java 파일 컴파일 되면 --> class! class파일이 수행됨
// c는 윈도우 컴파일러 리눅스 컴파일러 즉 os 종속적으로 컴파일
// 자바는 컴파일러를 통해서 바이트코드를 만들면 (바이트코드 = .class파일) 윈도우 가상머신
// 리눅스 가상머신등에서 실행할 수 있음
// 한번 컴파일한 클래스가 여러 머신에서 돌아갈 수 있다.
// 확장성 좋아 유지보수 좋아 재사용성!! 안정적 --> 자바의 장점
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        System.out.printf("%s", "Hello World!!");
    }
}
