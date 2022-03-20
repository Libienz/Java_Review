package generics;

public class Powder extends Material{

    @Override
    public String toString() {
        return "재료는 파우더입니다.";
    }

    @Override
    public void doPrintin() {
        System.out.println("파우더 재료로 출력중입니다.");
    }
}
