package abstractLab;

public class ComputerTest {
    public static void main(String[] args) {
        //Computer c1 = new Computer(); //추상클래스 인스턴스화 불가능
        //문법적으로 모든 메소드가 정의되어 있지만 abstract키워드를 붙임으로써
        //추상클래스로 만들 수도 있음
        //인스턴스의 생성을 막고 상속용으로만 사용하기 위해!
        Computer c2 = new DeskTop();
    }
}
