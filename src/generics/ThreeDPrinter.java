package generics;

import java.util.Collection;

public class ThreeDPrinter<T extends Material> { //매개변수 타입이 T 치환 비슷한 개념인듯?
    // T는 오브젝트 타입으로 먼저 잡히고 컴파일러가 캐스팅 작업을 수행해줌
    // T extends Material 은 Material 상속받은 애만 들어갈 수 있다.
    private T material; //플라스틱이나 파우더가 들어올 때 동시에 처리할 수 있는게 오브젝트!
    //제네릭 프로그래밍


    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
