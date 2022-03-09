package classPart.about_this;

class Birthday {
    int day;
    int month;
    int year;
}


public class This {
    public static void main() {

        Birthday b1 = new Birthday();
        Birthday b2 = new Birthday();

        //this가 가르키는건 자기 인스턴스의 주소값 클래스 내부에 써져있긴 하지만 ..
        //생성자 내에서 다른 생성자를 호출하기 위해 this를 쓸수도 있음

    }
}
